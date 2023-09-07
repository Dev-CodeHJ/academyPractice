package exec01;

import java.util.Arrays;
//6-7
//문제6-6에서 작성한 클래스메서드 getDistance()를 인스턴스메서드로 정의하시오.
class MyPoint {
	int x;
	int y;
	
	MyPoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x,int y) {
		
		double c = Math.pow(x-this.x,2)+Math.pow(y-this.y,2);
		return Math.sqrt(c);
	}
	
}

public class test14 {
	//6-6
	//두 점의 거리를 계산하는 getDistance()를 완성하시오.
//	static double getDistance(int x,int y,int x1,int y1) {
//		double c = Math.pow(x-x1,2)+Math.pow(y-y1,2);
//		return Math.sqrt(c);
//	}
	

	public static void main(String[] args) {
		
		//6-2
		//문제 6-1에서 정의한 클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오
		//실행결과 3 1K
//		SutdaCard card1 = new SutdaCard(3,false);
//		SutdaCard card2 = new SutdaCard();
//		
//		System.out.println(card1.info());
//		System.out.println(card2.info());
		
		//6-4
//		Student s = new Student();
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		
//		System.out.println("이름:"+s.name);
//		System.out.println("총점:"+s.getTotal());
//		System.out.println("평균:"+s.getAverage());
		
		//6-5
//		Student s = new Student("홍길동",1,1,100,60,76);
//		System.out.println(s.info());
		
		//6-6
//		System.out.println(getDistance(1,1,2,2));
		
		//6-7
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2, 2));
	}
}
//6-3
//다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//6-5
	//다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
	//실행결과 : 홍길동,1,1,100,60,76,236,78.7
	
	String info() {
		String s = name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
		return s;
	}
	
	
	/*6-4
		문제 6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드getTotal()과 getAverage()를 추가하시오.
		getTotal()
		국,영,수 점수를 모두 더해서 반환
		int
		getAverage()
		총점을 과목수로 나눈 평균을구한다.
		소수점 둘째자리에서 반올림
		float
	 */
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return Math.round(getTotal()/3f*10)/10.0f;
	}
}

//6-1
//다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
//int num = 카드의 숫자.(1~10사이의 정수)
//boolean isKwang = 광이면 true, 아니면 false
class SutdaCard {
		int num = 1;
		boolean isKwang = true;
		
		SutdaCard() {};

		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		};
		
		String info(){
			if(isKwang==true) {
				return num+"K";
			} else {
				return Integer.toString(num);
			}
		}
}
