//ch6-25 참조형 반환타입
// 1.Data3, Data4 클래스 생성
package ch6;

class Data3 { int x; }
class Data4 { int x; }
public class Ex6_8 {
	public static void main(String[] args) {
		// 2.참조변수 d가 가리키는 Data3 객체 생성 및 멤버변수 x값을 10으로 할당
		Data3 d = new Data3();
		d.x = 10;
		// 3.copy 메서드로 d2에 d의 값(객체 주소)을 복사한다.
		Data3 d2 = copy(d);
		// 7.Data4 참조변수 d1이 가리키는 객체 생성 및 멤버변수 x값을 20으로 할당
		Data4 d1 = new Data4();
		d1.x = 20;
		// 8.바뀌기전 d1.x값 출력
		System.out.println("원래 d1값 : "+d1.x);
		// 9. change 메서드 호출
		change(d1);
		// 12. d.x와 d2.x 복사후 값 출력
		System.out.println("d.x값 : " + d.x);
		System.out.println("d2.x값 : " + d2.x);
		
	}
	// copy 메서드 - 참조변수를 매개변수로 받기
	static Data3 copy(Data3 d) {
		// 4.참조변수 tmp가 가리키는 객체 생성
		Data3 tmp = new Data3();
		// 5.매개변수로 받아온 d.x값을 tmp.x에 복사
		tmp.x = d.x;
		// 6.tmp에 들어있는 객체의 주소반환
		return tmp;
	}
	// change 메서드 - 참조변수를 매개변수로 받기
	static void change(Data4 d) {
		// 10.x에 새로운 값 할당
		d.x = 100;
		// 11.바뀐값 출력
		System.out.println("바뀐값 출력 : "+ d.x);
	}

}