package ch6;

public class FactorialTest {
	// 예제 6-15 재귀호출을 이용한 팩토리얼 구하기 
	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if(n==1)
			result = 1;
		else
			result = n * factorial(n-1);
		
		return result;
	}

}
