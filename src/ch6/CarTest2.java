package ch6;

// 예제 6-25 생성자에서 다른 생성자 호출하기 - this(), this
class Car2{
	String color;       // 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car2(){
		this("white", "auto", 4); // 다른 생성자 호출시 this로 호출하고 맨 첫 줄에서 호출해야 함. 
	}
	
	Car2(String color){
		this(color, "auto", 4);

	}
	
	Car2(String color, String gearType, int door){
		this.color = color;				// 인스턴스 변수와 매개변수(지역변수)를 구별하기 위해 인스턴스 변수앞에 this를 붙인다.
		this.gearType = gearType;       // +) static 메서드에서는 iv를 사용할 수 없는 것처럼, this 역시 사용할 수 없다.
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door );
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door );
	}

}
