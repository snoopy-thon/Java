package ch6;
class Data6_14{ int x; }
public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data6_14 d = new Data6_14();
		d.x = 10;
		
		Data6_14 d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}
	
	static Data6_14 copy(Data6_14 d) {
		Data6_14 tmp = new Data6_14();
		tmp.x = d.x;
		
		return tmp;
	}

}
