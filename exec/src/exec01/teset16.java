package exec01;
//7-1
//7-2
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) {
			switch(i+1) {
			case 1,3,8 :
				cards[i] = new SutdaCard(i+1,true);
				break;
				
			default :
				cards[i] = new SutdaCard(i%10+1,false);
			}
		}
	}
	
	void shuffle() {
		SutdaCard tmp;
		for(int i=0;i<cards.length;i++) {
			int j = (int)(Math.random()*cards.length);
			tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int i) {
		return cards[i];
	}
	
	SutdaCard pick() {
		int i = (int)(Math.random()*cards.length);
		return cards[i];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	
	SutdaCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class teset16 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0;i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
