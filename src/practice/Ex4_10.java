package practice;

public class Ex4_10 {

	public static void main(String[] args) {
		int num =12345;
		int sum = 0;
		
		/*
		sum += num / 10000;
		num = num % 10000;
		
		sum += num / 1000;
		num = num % 1000;
		
		sum += num / 100;
		num = num % 100;
		
		sum += num / 10;
		num = num % 10;
		
		sum += num /1;
		num = num % 1;
		*/
		for(int i = (int)Math.log10(num); i>=0; i--) {
			sum += num / (int)Math.pow(10, i);
			num = num % (int)Math.pow(10, i);
		}
		
		System.out.println(sum);
		
	}

}
