package MyPoint;
//0818 6,7장 관련 프린트 문제
class Point {
	int x, y;

	Point(){
		this(1,1);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	static double getDistance(Point p1, Point p2) {
		double distance = Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
		return distance;
	}
	
	//두점이 어떤 걸 말하는지 모르겠음 매개변수 Point p하나만 받아서 어떻게 하라는 거지?
	// 나머지 한 점은 객체를 생성하여 생성자로 초기화한 (1,1) 로 생각함.
	double getDistance(Point p) {
		return Point.getDistance(new Point(), p);
	}

	
	boolean equals(Point p) {
		if(p instanceof Point && p.x == p.y)
				return true;
		else
			return false;
	}
	
	
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(){
		this(1,1,1);
	}
	
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		return super.toString()+ ", z: " + z;
	}
}

class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point(3,2);
		Point p2 = new Point(2,3);
		Point3D p3 = new Point3D();
		System.out.println(Point.getDistance(p1, p2));
		System.out.println(p2.getDistance(p2));
		System.out.println(p3.toString());
	}
}