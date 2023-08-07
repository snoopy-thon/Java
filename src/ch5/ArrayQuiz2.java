package ch5;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr2 = {1,3,2};
		int s = 0, b = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr2[j]) {
					if(i==j) {
						s++;
					}else {
						b++;
					}
				}
			}
		}
		System.out.printf("s = %d, b = %d",s,b);
		
		
	}

}
