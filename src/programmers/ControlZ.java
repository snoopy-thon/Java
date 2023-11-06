package programmers;

public class ControlZ {
    public int solution(String s) {
        // 1. 문자열을 공백기준으로 분리한다.
        // 2. 모든 문자열을 차례대로 더한다.
        //  2-1. 만약 Z가 나오면 바로전 인덱스 문자를 뺀다.
        int sum = 0;

        String[] newString = s.split("\\s");
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].equals("Z")) {
                sum -= Integer.parseInt(newString[i - 1]);
            } else {
                sum += Integer.parseInt(newString[i]);
            }
        }
        return sum;
    }

}
