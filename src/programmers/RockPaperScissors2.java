package programmers;

class Constant{
    public static final String SCISSORS = "2";
    public static final String ROCK = "0";
    public static final String PAPER = "5";
}

public class RockPaperScissors2 {
    public String solution(String rsp) {
        String answer = "";

        // 1. 문자열을 하나하나 분리하여 비교한다.
        // 2. 2 -> 0 / 0 -> 5 / 5 -> 2
        //    각각 해당하는 값을 result에 넣는다.

        for(String s : rsp.split("")){
            if(s.equals(Constant.SCISSORS))
                answer += Constant.ROCK;

            else if(s.equals(Constant.ROCK))
                answer += Constant.PAPER;

            else if(s.equals(Constant.PAPER))
                answer += Constant.SCISSORS;
        }

        return answer;
    }
}