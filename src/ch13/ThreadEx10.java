package ch13;

import java.sql.SQLOutput;

class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true); // 쓰레드 t를 데몬쓰레드로 변경, 이 부분이 없으면 종료 되지 않는다.
                           // 일반쓰레드가 모두 종료되면 데몬 쓰레드는 강제적으로 자동 종료
        t.start();         // 쓰레드 실행

        for(int i=1; i<=10; i++){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){}
            System.out.println(i);

            if(i==5)
                autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(3*1000);
            } catch(InterruptedException e) {}

            if(autoSave){
                autoSave();
            }
        }
    }

    public void autoSave(){
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}
