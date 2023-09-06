package exec01;

public class test14 {

	public static void main(String[] args) {
		//6-1
		//다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
		//int num = 카드의 숫자.(1~10사이의 정수)
		//boolean isKwang = 광이면 true, 아니면 false
		/*
		 * public class SutdaCard {
		 * 		public static void main(String[] args) {
		 * 			int num = (int)(Math.random()*10)+1;
		 * 			boolean isKwang;
		 * 			if(num==1||num==3||num==8){
		 * 				isKwang = true;
		 * 			} else { isKwang = false;}
		 * 		}
		 * }
		 */
		
		//6-2
		//문제 6-1에서 정의한 클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오
		//실행결과 3 1K
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
class SutdaCard {
		int num = 1;
		boolean isKwang = true;
		
		SutdaCard() {};

		SutdaCard(int a, boolean b) {
			num = a;
			isKwang = b;
		};
		
		String info(){
			if(isKwang==true) {
				return num+"K";
			} else {
				return Integer.toString(num);
			}
		}
}
