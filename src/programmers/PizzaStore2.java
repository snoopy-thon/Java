package programmers;

public class PizzaStore2 {
    // 머쓱이네 피자가게 더 간단한 풀이법
    public int solution(int n) {
        int answer = 1;
        while(true){
            if((6*answer) % n == 0 )
                break;
            answer++;
        }

        return answer;
    }
}
