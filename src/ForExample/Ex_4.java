package ForExample;
/* 
 혼자 못 풀었음 나중에 꼭 다시 풀기 
 Tip! i와 j를 [i,j] 순서쌍으로 놓고 풀기 + 조건들의 합집합 교집합, 여집합 등을 이용하기
 
			*   *
			 * *
			  *
			 * *
			*   *
*/
public class Ex_4 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5 ; j++) {
				if(i==j || i+j==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}


