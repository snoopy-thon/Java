package ch5;

public class ArrayQuiz1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr2 = {1,2,3};
		int result=0;
		// boolean eq = true;
		
		
		for(int i=0; i<3; i++) {
			if(arr[i] != arr2[i]) {
				System.out.println("다릅니다."); // eq = false
				break;
			}else {
				result++;
			}
		}
		if(result == 3) { // eq == true
			System.out.println("같습니다.");
		}
		
		
	}

}
