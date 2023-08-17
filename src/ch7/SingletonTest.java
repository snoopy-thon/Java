package ch7;
// 예제 7-14 
final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		// ...
	}
	
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s = new Singleton();  Singleton의 생성자가 private이므로 에러남
		Singleton s = Singleton.getInstance();
	}

}
