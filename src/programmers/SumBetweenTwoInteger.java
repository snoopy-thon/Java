package programmers;

public class SumBetweenTwoInteger {
    // 두 정수 사이의 합
    public static int solution(long num) {
        int count = 0;
        if(num == 1){
            return 0;
        }
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = (num * 3) + 1;
            }
            count ++;
            System.out.printf("%d 번 계산 후 num : %d\n",count,num);
            if((count == 500) && (num != 1)){
                return -1;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

}
