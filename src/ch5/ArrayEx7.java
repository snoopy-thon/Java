package ch5;

public class ArrayEx7 {
	// 예제 5-7 섞기(shuffle)
	public static void main(String[] args) {
		// 크기가 10인 배열 생성
		int[] numArr = new int[10];
		// 배열을 차례대로 0~9의 숫자로 초기화
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
		}
		// 초기화된 원래 배열 출력
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
		System.out.println();
		// Math.random() 함수를 이용하여 임의의 인덱스를 추출한 후 그 안에 있는 값과 0번째 값을 100번 바꾸기
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		// 바뀐 배열 출력하기
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}

}
