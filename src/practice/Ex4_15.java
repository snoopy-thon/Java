package practice;

public class Ex4_15 {
// 일단 넘어가자
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		while(tmp != 0) {
			
			result += (int)Math.pow(10,(int)Math.log10(tmp)) * (tmp % 10);
			
			tmp = (tmp - tmp % 10) / 10;
			
		}
		
		if(number == result) {
			System.out.println(number + "는 회문수 입니다.");
		}else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}

}
