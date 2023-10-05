package programmers;
import java.util.Arrays;
public class MaxValue {
    public static int solution(int[] numbers) {
        final int LASTINDEX = numbers.length - 1;

        // 1. 가장 큰 수, 2번째로 큰 수를 곱하기
        // 2. 가장 작은 수와 두번째로 작은 수를 곱하기
        // 3. 그 둘을 비교하여 더 큰 값을 리턴한다.

        Arrays.sort(numbers);
        int plusPlus = numbers[LASTINDEX] * numbers[LASTINDEX-1];
        int minusMinus = numbers[0] * numbers[1];
        int answer = Math.max(plusPlus, minusMinus);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, -1};
        int maxValue = solution(arr);
        System.out.println(maxValue);
    }
}
