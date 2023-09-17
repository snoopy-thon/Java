public class UpperLower {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char tmp = my_string.charAt(i);
            // 대문자일 경우 소문자로 변환
            if(tmp>=65 && tmp<=90)
                answer+=Character.toString(Character.toLowerCase(tmp));
                // 소문자일 경우 대문자로 변환
            else
                answer += Character.toString(Character.toUpperCase(tmp));
        }
        return answer;
    }
}
