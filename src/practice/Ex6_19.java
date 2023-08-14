package practice;
// 연습문제 6-19 매개변수로 그냥 문자열 주면 안바뀜
public class Ex6_19 {
	public static void change(String str) {
		str += "456";
	}
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}

}
