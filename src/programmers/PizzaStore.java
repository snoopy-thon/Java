package programmers;

public class PizzaStore {
    public int solution(int n) {
        int answer = 0;
        // 1. n과 6의 최소 공배수 구하기
        //    10*1 10*2 10*3 ...
        //    6*1 6*2 6*3 ...

        int i = 1, j = 1;
        while(true){
            while(n*i >= 6*j){
                if (n * i == 6 * j) {
                    answer = j;
                    break;
                }
                j++;
            }
            i++;
            if(answer != 0)
                break;
        }
        return answer;
    }
}
