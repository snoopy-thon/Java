package ch5;

public class ArrayEx11 {
	// 예제 5-11 빈도수 구하기
	public static void main(String[] args) {
		//두 개의 배열 생성
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		// 임의의 수를 배열에 저장
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		// 숫자 개수 세기
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		//출력하기
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의 개수 :"+ counter[i]);
		}
	}

}
