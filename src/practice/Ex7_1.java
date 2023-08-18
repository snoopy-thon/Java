package practice;
// 연습문제 7-1번
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < 20; i++) {
			if (i <= 9) {
				if (i + 1 == 1 || i + 1 == 3 || i + 1 == 8)
					cards[i] = new SutdaCard2(i + 1, true);
				else
					cards[i] = new SutdaCard2(i + 1, false);
			} else
				cards[i] = new SutdaCard2(i - 9, false);
		}
	}
}

	class SutdaCard2 {
		int num;
		boolean isKwang;

		SutdaCard2() {
			this(1, true);
		}

		SutdaCard2(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}

		public String toString() {
			return num + (isKwang ? "K" : "");
		}
	}

public class Ex7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++) 
			System.out.print(deck.cards[i]+",");
		
	}

}
