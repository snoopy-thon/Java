package ch6;
class Data { int x; }
// 예제 6-9 기본형 매개변수일때 값 변경 불가
public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	// 매개변수가 기본형일 때 메소드에서 변경하려고 해도 실제 값 변경 안됨
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
