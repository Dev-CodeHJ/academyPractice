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

//7-5
class Product {
	int price;
	int bonusPoint;
	
	Product(){}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {}
	
	public String toString() {
		return "Tv";
	}
}

//7-10
class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int prevChannel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class teset16 {

	public static void main(String[] args) {
		//7-1, 7-2
//		SutdaDeck deck = new SutdaDeck();
//		
//		System.out.println(deck.pick(0));
//		System.out.println(deck.pick());
//		deck.shuffle();
//		
//		for(int i=0;i<deck.cards.length;i++) {
//			System.out.print(deck.cards[i]+",");
//		}
//		
//		System.out.println();
//		System.out.println(deck.pick(0));
		
		//7-5
//		Tv t = new Tv();
//		System.out.println(t);
		
		//7-10
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(30);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:"+t.getVolume());
	}

}
