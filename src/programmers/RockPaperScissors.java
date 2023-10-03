package programmers;


class RockPaperScissors {
    public String solution(String rsp) {
        String answer = "";
        // 1. 문자열을 하나하나 분리하여 비교한다.
        // 2. 2 -> 0 / 0 -> 5 / 5 -> 2
        //    각각 해당하는 값을 result에 넣는다.
        for(String s : rsp.split("")){
            if(s.equals("2"))
                answer += "0";
            else if(s.equals("0"))
                answer += "5";
            else if(s.equals("5"))
                answer += "2";
        }

        return answer;
    }
}