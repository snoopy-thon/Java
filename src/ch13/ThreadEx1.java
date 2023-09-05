package ch13;
// 쓰레드 구현 방법 2가지
// 1. Thread 클래스 상속받기 -> Thread 클래스의 run()을 오버라이딩
// 2. Runnable 인터페이스 구현하기 -> Runnable 인터페이스의 run()을 구현
public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread { // Thread 클래스 상속받기 -> Thread 클래스의 run()을 오버라이딩
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable { // Runnable 인터페이스 구현하기 -> Runnable 인터페이스의 run()을 구현
    public void run() {
        for(int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
