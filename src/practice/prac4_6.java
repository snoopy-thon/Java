package practice;

public class prac4_6 {
// 4-6 주사위 합 6이 되는 경우의 수 출력
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.printf("i=%d, j=%d%n",i,j);
				}
			}
		}
		
	}

}
