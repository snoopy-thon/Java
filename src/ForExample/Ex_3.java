package ForExample;
/*
	    *
	   *
	  *
	 *
	*
*/
public class Ex_3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			// j<=(5-j) 대신 i+j<=5 써도 된다 
			for(int j=1; j<=(5-i); j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
