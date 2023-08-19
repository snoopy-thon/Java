package practice;

public class Ex5_9 {

	public static void main(String[] args) {
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				
				result[j][i] = star[3-i][j];
				
			}
		}
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
//00 -> 03 
//10 -> 02
//20 -> 01
//30 -> 00

//01 -> 13
//11 -> 12
//21 -> 11
//31 -> 10

//j = 01234
//i = 0123

//22 -> 21
//32 -> 20

//23 -> 31
//33 -> 30

//24 -> 41
//34 -> 40