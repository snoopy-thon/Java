package ch5;

public class ArrayQuiz3 {

	public static void main(String[] args) {
		int[] arr = {4,2,2,4,1,7,3,2,5,1,3}; 
		int[] counter = new int[arr.length];
		
		
		
		for(int i=0; i<arr.length; i++) {
			counter[arr[i]]++;
		}
		
		// 중복 제거
		// 개수가 1이상이면, 해당하는 인덱스를 가져와서 출력한다.
		for(int i=0; i<counter.length; i++) {
			if(counter[i]>=1) {
				System.out.print(i);
			}
		}
		System.out.println();
		
		// 정렬
		// 개수가 1이상이면, 차례대로 개수만큼 출력한다.
		for(int i=0; i<counter.length; i++) {
			if(counter[i]>=1) {
				for(int j=1;j<=counter[i];j++) {
					System.out.print(i);
				}
			}
		}
		
	}

}
