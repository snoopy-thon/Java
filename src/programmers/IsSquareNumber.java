package programmers;

public class IsSquareNumber {
    public int solution(int n) {
        int answer = 0;
        // 만약 n 나누기 1,2,3...,n/2 한 결과가 같은 값이면 return 1
        // 아니면 return 2
        if(n==1){
            answer = 1;
            return answer;
        }
        for(int i=1; i<= n/2; i++){
            if((n/(i*1.0)) == (i*1.0)){
                answer = 1;
                break;
            }
            else
                answer = 2;
        }
        return answer;
    }
}
