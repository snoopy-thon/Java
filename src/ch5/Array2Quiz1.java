package ch5;

public class Array2Quiz1 {
	// Quiz-1. 1차원 배열 arr의 값들을 2차원 배열 4행 3열 arr2에 복사하여 출력하시오.
	public static void main(String[] args) {
		int[] arr = new int[12];
		int[][] arr2 = new int[4][3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// for문 하나만 쓰기
		for(int i=0; i<arr.length; i++) {
			arr2[i/3][i%3] = arr[i];
		}
		
		// 2차원 배열 출력
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
	// Quiz-2. 반대로 다시 2차원 배열 arr2값을 1차원 배열 arr3으로 옮기시오.
		int[] arr3 = new int[12];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr3[j+i*3] = arr2[i][j];
				System.out.print(arr2[i][j]);
			}
		}
		
	}

}
