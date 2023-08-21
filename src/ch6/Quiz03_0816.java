package ch6;
// 카드게임 퀴즈 3번
import java.util.Arrays;
import java.util.Objects;

// Q3. 5장의 카드를 배열로 받아서 등급을 문자열로 반환하는 rankCheck 메서드를 작성하시오.
class Card3 {
	String shape;	// 카드 모양(H, D, S, C)
	int num;		// 카드 숫자(1~10)
	static int[] counter = new int[10];	// 카드 숫자별 개수 셀 때 필요한 배열

	Card3() {	// 기본 생성자
	}

	Card3(String shape, int num) {	// 모양과 숫자를 초기화하는 생성자
		this.shape = shape;
		this.num = num;
	}

	String rankCheck(Card3[] arr) {		// rank를 check하는 메서드
		String rank = "";


		// 숫자별 카드 개수 세기
		for (int i = 0; i < arr.length; i++) {
			counter[arr[i].num - 1]++;
		}


		for (int i = 0; i < arr.length; i++) {
			if (counter[arr[i].num - 1] == 4) {				// 같은 숫자 4장
				rank = "FOUR CARD";
			} else if (counter[arr[i].num - 1] == 3) {		// 같은 숫자 3장
				rank = "THREE CARD";
			} else if (counter[arr[i].num - 1] / 2 == 2) {	// 같은 숫자 2쌍
				rank = "2 PAIR";
			} else if (counter[arr[i].num - 1] / 2 == 1) {	// 같은 숫자 1쌍
				rank = "1 PAIR";
			} else if (counter[arr[i].num - 1] / 2 == 0) {	// 아무것도 해당되지 않음.
				rank = "NO RANK";
			}
		}

		// 5개 모두 연속된 숫자면 STRAIGHT
		//for (int i = 0; i <= counter.length / 2; i++) {
			//if (counter[i] == 1 && counter[i + 1] == 1 && counter[i + 2] == 1 && counter[i + 3] == 1 && counter[i + 4] == 1)
				//rank = "STRAIGHT";
		//}


		// 5개 모두 연속된 숫자면 STRAIGHT
		int numResult = 0;
		for (int i = 0; i <= counter.length / 2; i++) {
			numResult = 0;
			for(int j=0; j<counter.length/2; j++){
				if(counter[i+j] == 1)
					numResult++;
				else
					break;
			}

			if (numResult == 5) {
				rank = "STRAIGHT";
				break;
			}
		}

		// 5장의 모양이 모두 같은 경우
		int shapeResult = 0;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i].shape.equals(arr[i + 1].shape))
				shapeResult++;
			else
				break;
		}
		if(shapeResult == 4){
			rank = "FLUSH";
		}


		// 5장 모두 연속된 숫자이면서, 모양도 같은 경우
		if(numResult == 5 && shapeResult == 4)
			rank = "STRAIGHT FLUSH";

		return rank;
	}
}


public class Quiz03_0816 {
   
	public static void main(String[] args) {
		Card3[] arr = new Card3[5];
		arr[0] = new Card3("H",5);
		arr[1] = new Card3("H",4);
		arr[2] = new Card3("H",7);
		arr[3] = new Card3("H",8);
		arr[4] = new Card3("H",6);

		Card3 c = new Card3();
		System.out.println(c. rankCheck(arr));


	}

}
