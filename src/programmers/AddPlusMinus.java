package programmers;

public class AddPlusMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        // 만약 signs가 true이면 그대로 더하고
        // false이면 뺀다.
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){
                sum += absolutes[i];
            }else{
                sum -= absolutes[i];
            }
        }
        return sum;
    }
}
