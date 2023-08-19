package ch6;

public class Quiz01_0816 {
	static int mid(int x, int y, int z) {
		int midValue = 0;
		// 세 개의 숫자중 최댓값을 찾고, 나머지 두 수를 비교하여 둘 중 더 큰 수가 중간값이다.
		if(x>y) { 
			if(x>z) 
				// maxValue = x; 
				midValue = y > z ? y : z;
			else 
				// maxValue = z;
				midValue = x > y ? x : y;
		}
		else {
			if(y>z)
				// maxValue = y; 
				midValue = x > z ? x : z;
			else
				// maxValue = z;
				midValue = x > y ? x : y;
		}
		return midValue;
	}
	
	public static void main(String[] arg) {
		int answer=0;
		answer = mid(6,4,5);
		System.out.println("answer = " + answer);
	}

}
