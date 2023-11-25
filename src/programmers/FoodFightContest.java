package programmers;

public class FoodFightContest {
    public String solution(int[] food) {
        String answer = "";
        // food[i] / 2
        // java.lang.StringBuffer 클래스의 reverse()메서드 사용하기
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i] / 2; j++){
                answer += i;
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        answer = answer + '0' + reverse;
        return answer;
    }
}
