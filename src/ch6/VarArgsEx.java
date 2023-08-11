package ch6;

public class VarArgsEx {
	// 예제6-22 가변인자 예제
	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};
		
		System.out.println(concatenate("","100","200","300")); 
		System.out.println(concatenate("-",strArr)); 
		System.out.println(concatenate(",",new String[] {"1","2","3"})); 
		System.out.println(concatenate(",",new String[0] +"]")); 
		System.out.println(concatenate("["+concatenate(",")+"]")); 
		
 	}
	
	static String concatenate(String delim, String...args) {
		String result ="";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}
/*
    // 가변인자를 선언한 메서드를 오버로딩하면, 메서드를 호출했을 때 이와 같이 구별되지 못하는 경우가 발생하기 쉽다.
    // 가변인자를 사용한 메서드는 가능하면 오버로딩하지 x
	static String concatenate(String... args) {
		return concatenate("", args);
	}
*/
}
