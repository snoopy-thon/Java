package ch6;

public class OverloadingTest {
    // 예제6-21 오버로딩 예제
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과:"    + mm.add(3,3));
		System.out.println("mm.add(3,3) 결과:"    + mm.add(3,3));
		System.out.println("mm.add(3,3) 결과:"    + mm.add(3,3));
		System.out.println("mm.add(3,3) 결과:"    + mm.add(3,3));
		
		int[] a = {100,200,300};
		System.out.println("mm.add(a) 결과: "+mm.add(a));
		
	}
}
class MyMath3{
	int add(int a, int b) {
		System.out.print("add(a,b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("add(a,b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("add(a,b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("add(a,b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
	
}
