package practice;

// 연습문제 7-2번
class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard3[] cards = new SutdaCard3[CARD_NUM];

	SutdaDeck2() {
		for (int i = 0; i < 20; i++) {
			if (i <= 9) {
				if (i + 1 == 1 || i + 1 == 3 || i + 1 == 8)
					cards[i] = new SutdaCard3(i + 1, true);
				else
					cards[i] = new SutdaCard3(i + 1, false);
			} else
				cards[i] = new SutdaCard3(i - 9, false);
		}
	}
	
	void shuffle(){
		for(int j=0; j<cards.length; j++) {
			int r = (int)(Math.random() * CARD_NUM);
			SutdaCard3 tmp = cards[j];
			cards[j] = cards[r];
			cards[r] = tmp;
		}
			
		
	}
	
	
	SutdaCard3 pick(int index) {
		return cards[index];
	}
	
	SutdaCard3 pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return cards[index];
	}
}

class SutdaCard3 {
	int num;
	boolean isKwang;

	SutdaCard3() {
		this(1, true);
	}

	SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_2 {
	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		

		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
