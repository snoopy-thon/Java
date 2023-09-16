package programmers;

public class HiddenNumber {

        public int solution(String my_string) {
            int answer = 0;
            // 문자열을 한글자씩 판별한다.-> charAt()으로!
            // 숫자인지 아닌지 확인
            //  -> 아스키코드값 48~57인가? -> Yes 숫자
            // 숫자라면 answer에 더한다.
            for(int i=0; i<my_string.length(); i++){
                char c = my_string.charAt(i);
                if((c >= 48) && (c <= 57)){
                    answer += (int)c - '0';
                }
            }


            return answer;
        }
}

