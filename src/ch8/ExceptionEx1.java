package ch8;
// 예제 8-2
public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try{ } catch (Exception e) { }
        } catch (Exception e) {
            try { } catch (Exception e2){ } // 참조변수 e 사용하면 에러남. 그래서 e2로 바꿈
        }

        try {

        } catch (Exception e) {

        }
    }
}
