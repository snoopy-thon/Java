package ch7;
//예제 7-5
public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent{
	int x=10;
}

class Child extends Parent{
	void method() {
		// 아래 x들은 모두 같은 변수를 의미한다.
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
