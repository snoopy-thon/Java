package programmers;

public class dice {
    public int solution(int[] box, int n) {
        // box[0] / n , box[1] / n , box[2] / n
        // 세 개의 값을 곱한다.
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
}
