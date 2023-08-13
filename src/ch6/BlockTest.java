package ch6;
// 예제6-27 초기화 블럭
// 초기화 순서 : 클래스 초기화 블럭 - 인스턴스 초기화 블럭 - 생성자
// 클래스 초기화 블럭은 클래스가 메모리에 처음 로딩될 때 한번만 수행되고,
// 인스턴스 초기화 블럭은 생성자와 같이 인스턴스를 생성할 때 마다 수행된다.
public class BlockTest {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}

}
