package programmers;
class StringCheck {
    public static void main(String[] args) {
        String str1 = "AbcAbcA";
        String str2 = "AAA"	;
        System.out.println(solution(str1,str2));
    }
    public static int solution(String str1, String str2) {
        int answer = 1;
        // 1. str2 문자열을 한개씩 가져온다. charAt으로! ex) 6
        // 2. str1 문자열을 한개씩 문자를 가져와서 arr[i]과 같은지 반복문으로 확인한다.
        //  2-1. 만약 같다면 바로 다음 문자가 arr[i+1](ex. C)과 같은지 확인한다. equals 사용
        //  arr의 길이만큼 확인 했는데 모두같다면 answer=1로 하고 반복문을 나온다.
        //  중간에 같지 않다는 게 확인되면 반복문을 빠져나간다.
        for(int i=0; i<= str1.length()-str2.length()+1; i++) {
            if(str1.charAt(i) == str2.charAt(0)) {
                answer = 1;
                for (int j = 1; j < str2.length(); j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        answer = 2;
                        break;
                    }
                }
                if(answer == 1) break;
            }else answer = 2;
        }
        return answer;
    }
}