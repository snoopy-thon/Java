package practice;
// 연습문제 6-20번
public class Ex6_20 {
	static int[] shuffle(int[] arr) {
		// 랜덤 인덱스의 배열값과 값을 바꿔서 배열 섞기
		for(int i=0; i<arr.length; i++) {
			int randomNum = (int)(Math.random() * arr.length);
			int tmp = arr[i];
			arr[i] = arr[randomNum];
			arr[randomNum] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
