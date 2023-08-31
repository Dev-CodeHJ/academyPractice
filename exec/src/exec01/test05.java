package exec01;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		
//		/* 학점 처리(switch)
//		 * 1. 사용자에게 점수 입력받기
//		 * 2. 점수에 따라 학점 부여하기
//		 * 3. 사용자가 입력한 점수에 따른 학점 출력하기
//		 * 90점 이상 : A
//		 * 80점 이상 : B
//		 * 70점 이상 : C
//		 * 그 이하   : F
//		 * */
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.printf("점수를 입력하세요(1~100) : ");
//		int score = sc.nextInt();
//		char grade;
//		char option = ' ';
//
//		switch(score/10) {
//			case 10, 9:
//				switch(score%10) {
//					case 9, 8, 7, 0:
//						option = '+';
//						break;
//				}
//				
//				grade = 'A';
//				break;
//				
//			case 8:
//				switch(score%10) {
//				case 9, 8, 7:
//					option = '+';
//					break;
//				}
//				
//				grade = 'B';
//				break;
//				
//			case 7:
//				switch(score%10) {
//				case 9, 8, 7:
//					option = '+';
//					break;
//				}
//				
//				grade = 'C';
//				break;
//				
//			default:
//				grade = 'F';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다.", grade,option);
//		sc.close();


//		/* 주민번호를 입력받고 남자인지 여자인지 출력하기
//		 * (regNo.charAt(7))
//		 * */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.printf("주민등록번호를 입력하세요 : ");
//		String regNo = sc.nextLine();
//		
//		switch(regNo.charAt(7)) {
//			case '1', '3':
//				System.out.println("남자입니다.");
//				break;
//			case '2', '4':
//				System.out.println("여자입니다.");
//				break;
//			default:
//				System.out.println("주민번호가 올바르지 않습니다.");
//		}
//		sc.close();


//		String num = "";
//		
//		for(int i=1;i<=5;i++) {
//			System.out.println(i);
//			num += i;
//		}
//		System.out.println(num);


//		for(int i=0; i<10; i++) {
//			System.out.print(i);
//		}


//		for(int i=1; i<=10; i++) {
//			if(i%3==0) {
//				System.out.println(i);
//			}
//		}


//		//1~20사이 짝수의 합
//		int sum=0;
//		for(int i=1; i<=20; i++) {
//			if(i%2==0) {
//				sum +=i;
//			}
//		}
//		System.out.println(sum);


//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}


		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d	 ", i, j, i*j);
				if(j==9) {
					System.out.printf("%n");
				}
			}
		}
		
	}
}
