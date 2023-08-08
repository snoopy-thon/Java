package ch6;

// 예제 6-16 매개변수의 유효성 검사를 추가한 팩토리얼 구하기 코드
public class FactorialTest2 {
	static long factorial(int n) {
		if(n<=0 || n>20) return -1; // 매개변수의 유효성 검사.
		if(n<=1) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result = factorial(i);
			
			if(result==-1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
				break;
			}
			
			System.out.printf("%2d!=%20d%n", i, result);
		}
	}

}
