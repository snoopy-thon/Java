package ch8;
// 예제 8-2 정수를 0으로 나눌 경우 ArithmeticException 발생
public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i=0; i<10; i++){
            result = number / (int)(Math.random() * 10);
            System.out.println(result);
        }
    }
}
