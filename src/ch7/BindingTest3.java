package ch7;
// 예제 7-20 메서드는 오버라이딩해도 무조건 실제 인스턴스의 메서드가 호출된다.
public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent3{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {
    int x = 200;

    @Override
    void method() {
        System.out.println("x=" + x);
        System.out.println("super.x=" + super.x);
        System.out.println("this.x=" + this.x);
    }
}
