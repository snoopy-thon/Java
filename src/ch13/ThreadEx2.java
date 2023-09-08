package ch13;
public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1(); // 쓰레드 생성하기
        t1.start(); // 쓰레드 실행 시키기 -> start()를 호출하면 호출스택을 생성한 다음, run()도 호출됨.
    }
}

class ThreadEx2_1 extends Thread { // Thread 클래스 상속 받아서 Thread 구현하기
    public void run(){             // Thread 클래스의 run()을 오버라이딩
        throwException();          // 예외 발생시키는 함수 호출
    }

    public void throwException(){
        try {
            throw new Exception(); // 고의로 예외 발생시키기
        } catch (Exception e){
            e.printStackTrace(); // 예외에 대한 정보 출력
         }
    }

}
