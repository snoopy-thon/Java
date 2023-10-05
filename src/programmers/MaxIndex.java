package programmers;

public class MaxIndex {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int count = 0, maxIndex = 0;

        for(int i:array){
            if(i>max){
                max = i;
                maxIndex = count;
            }
            count ++;
        }
        answer[0] = max;
        answer[1] = maxIndex;
        return answer;
    }
}
