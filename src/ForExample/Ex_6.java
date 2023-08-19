package ForExample;
/*
	*****
	****
	***
	**
	*
*/
public class Ex_6 {
	public static void main(String[] args) {
		// 내가 푼 방법
		for(int i=0; i<5; i++) {
			
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		// 다른 풀이법
		for(int i=1; i<=5; i++) {
			for(int j=1; i+j<=6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
