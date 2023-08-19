package practice;

public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		float f = 3.0f/2.0f;
		long l = 3000L*3000*3000;
		
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		
		String str = "yes";
		
		
		System.out.println(result);
		
		System.out.println(l);
		System.out.println(f);
		
		ch += 2;
		System.out.println(ch);
		
		System.out.println(c);
		
		int f1 = 100;
		float c1 = (int)((5.0f/9.0f * (f1-32))*100 + 0.5) / 100.0f;
		System.out.println(c1);
		
	}

}
