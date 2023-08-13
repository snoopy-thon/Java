package ch6;
// 예제 6-23 생성자 
class Data10{
	int value;
}

class Data20{
	int value;
	
	Data20(int x){
		value = x;
	}
}
public class ConstructorTest {
	public static void main(String[] args) {
		Data10 d1 = new Data10();
		
	 // Data20 d2 = new Data20(); 에러남(Data20은 이미 생성자가 있기 때문에 기본생성자를 자동 추가 해주지 않음.)
		Data20 d2 = new Data20(10);
		System.out.println(d2.value);
	}

}
