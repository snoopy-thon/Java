package ch6;

// 예제 6-10
class ChangeData{ int x; }

public class ReferenceParamEx {
	public static void main(String[] args) {
		ChangeData d = new ChangeData();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	// 매개변수를 참조형으로 바꾸니 값변경 가능
	static void change(ChangeData d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
