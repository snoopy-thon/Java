package practice;
// 연습문제 6-5번
public class Ex6_5 {

	public static void main(String[] args) {
		Student2 s = new Student2("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}

}

class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		float average = (float)getTotal() / 3;
		return (float)Math.round(average * 10) / 10;
	}
	
	String info(){
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage(); 
	}
}