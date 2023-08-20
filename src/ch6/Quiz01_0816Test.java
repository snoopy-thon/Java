package ch6;
/*
//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

class Quiz01_0816Test {
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
	//@Test
	//void test() {
		assertTrue(mid(1,2,3)==2);
	//}

}
*/