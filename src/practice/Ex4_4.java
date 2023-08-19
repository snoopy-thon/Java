package practice;

public class Ex4_4 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(true) {
			if(i%2 == 1) {
				sum += i;
			}else {
				sum -= i;
			}
			if(sum>=100) {
				break;
			}
			i++;
		}
		
		System.out.println("sum="+sum);
		System.out.println("i="+i);
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);
		System.out.println(y>=5 || x<0 && x>2);
		System.out.println(y+= 10 - x++);
		System.out.println(x += 2);
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);  
		System.out.println(c++);  
		System.out.println(c);  
		
		
		
		
	}

}
