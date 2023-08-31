package exec01;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		
		/* 학점 처리
		 * 1. 사용자에게 점수 입력받기
		 * 2. 점수에 따라 학점 부여하기
		 * 3. 사용자가 입력한 점수에 따른 학점 출력하기
		 * 90점 이상 : A
		 * 80점 이상 : B
		 * 70점 이상 : C
		 * 그 이하   : F
		 * */

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요 : ");
		int a = sc.nextInt();
		
//		if(a>100 || a<0) {
//			System.out.println("점수를 잘못입력하셨습니다.");
//		} else {
//			
//			char c;
//			if(a >= 90) {
//				c = 'A';
//			} else if(a >= 80) {
//				c = 'B';
//			} else if(a >= 70) {
//				c = 'C';
//			} else {
//				c = 'F';
//			}
//			System.out.printf("당신의 학점은 %s입니다.", c);
//		}
		

		char c;
		String msg = "당신의 학점은 %s입니다.";
		
		if(a <= 100 && a >= 90) {
			c = 'A';
			System.out.printf(msg, c);
		}
		if(a < 90 && a >= 80) {
			c = 'B';
			System.out.printf(msg, c);
		}
		if(a < 80 && a >= 70) {
			c = 'C';
			System.out.printf(msg, c);
		}
		if(a < 70 && a >= 0) {
			c = 'F';
			System.out.printf(msg, c);
		}
		if(a > 100 || a < 0) {
			System.out.println("점수가 올바르지 않습니다.");
		}
		sc.close();
	}

}
