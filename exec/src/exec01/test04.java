package exec01;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		/* 1. 계산기 만들기
		 * 숫자를 두 개 입력받고, 연산자를 입력받아서
		 * 해당 연산의 출력값만 보여주기
		 * 
		 * (추가)
		 * 뺄셈 연산 시,
		 * 현재 3, 8입력 : -5
		 * 개선 > 8, 3 입력한 값과 같게 : 5
		 * 
		 * 
		 * 2. 학점처리
		 * 사용자에게 점수를 입력받고
		 * 점수에 따라 학점 부여
		 * 사용자가 입력한 점수에 따른 학점 출력
		 * 끝자리 7,8,9면 +붙여주기, C학점 이상만
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 그 이하 F
		 * */

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.printf("원하는 문제를 선택하세요 %n 1번) 계산기 %n 2번) 학점처리 %n 문제 : ");
//		int choice = sc.nextInt();
//		
//		if(choice == 1) {												// 1번 계산기 문제
//			
//			System.out.printf("첫 번째 정수를 입력하세요 : ");
//			int a = sc.nextInt();
//			
//			System.out.printf("두 번째 정수를 입력하세요 : ");
//			int b = sc.nextInt();
//			
//			System.out.printf("연산자를 입력하세요 : ");
//			String c = sc.next();
//			
//			if(c.equals("+")) {
//				System.out.printf("%d %s %d = %d", a, c, b, a+b);
//			} 
//			
//			else if(c.equals("-")) {
//				if(a < b) {
//					int x = a;
//					a = b;
//					b = x;
//				}
//				System.out.printf("%d %s %d = %d", a, c, b, a-b);
//			}
//			
//			else if(c.equals("*")) {
//				System.out.printf("%d %s %d = %d", a, c, b, a*b);
//			}
//			
//			else if(c.equals("/")) {
//				System.out.printf("%d %s %d = %d", a, c, b, a/b);
//			}
//			
//			else {
//				System.out.println("입력된 연산자가 올바르지 않습니다.");
//			}
//		}
//		
//		
//		else if(choice == 2) {									// 2번 학점 처리 문제
//				
//			System.out.printf("점수를 입력하세요 : ");
//			int score = sc.nextInt();
//			char grade;
//			char option = ' ';
//			
//			if(score > 100 || score < 0) {
//				System.out.println("점수는 100점~0점 사이로 입력해주세요!");
//			} else {
//				
//				if(score >= 90) {
//					grade = 'A';
//					if(score >= 97) {
//						option = '+';
//					}
//					System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
//				} 
//				
//				else if(score >= 80) {
//					grade = 'B';
//					if(score >= 87) {
//						option = '+';
//					}
//					System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
//				}
//				
//				else if(score >= 70) {
//					grade = 'C';
//					if(score >= 77) {
//						option = '+';
//					}
//					System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
//				}
//				
//				else {
//					grade = 'F';
//					System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
//				}
//			}
//		}
//		
//		else {
//			System.out.println("1번과 2번 중 선택해주세요!!");
//		}
//		sc.close();
//		
		
//		//학점계산기 ex01
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("학점계산기");
//		System.out.print("이름 :");
//		String name = scan.next();
//		
//		System.out.print("과목 :");
//		String subject = scan.next();
//		
//		System.out.print("점수 :");
//		int score = scan.nextInt();
//		
//		int a = score % 10;
//		String msg = "";
//		
//		
//		if (score>=90) {
//			msg="A";
//		}
//		else if (score>=80) {
//			msg="B";
//		}
//		else if (score>=70) {
//			msg="C";
//		}
//		else {
//			msg="F";
//		}
//		
//		if ((a > 6 && score >= 70) || score == 100) {
//			msg += "+";
//		}
//		
//		System.out.printf("%s 님의 %s 학점은 %s 입니다.", name, subject, msg);
		
		
//		//삼항연산자 조건 ? 참 : 거짓
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.printf("사과의 개수를 입력하세요 : ");
//		int numOfApples = sc.nextInt();
//		
//		System.out.printf("바구니 안에 들어갈 수 있는 사과의 최대 개수 : ");
//		int sizeOfBucket = sc.nextInt();
//		
//		int remain = numOfApples%sizeOfBucket;
//		int numOfBucket = numOfApples/sizeOfBucket;
//		
//		numOfBucket = (remain != 0) ? numOfBucket+=1 : numOfBucket;
//		
////		if(remain != 0) {
////			numOfBucket += 1;
////		}
//		
//		System.out.println("필요한 바구니의 수 : "+numOfBucket);
//		
//		sc.close();
		
		
		// 숫자를 입력받아서 3의 배수인지 아닌지 판별하는 프로그램
//		Scanner sc = new Scanner(System.in);
//
//		System.out.printf("숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		String msg;
//		
////		//삼항(조건)연산자
////		msg = ((num%3)==0) ? "3의 배수입니다." : "3의 배수가 아닙니다.";
//		
//		//if문
//		if((num%3)==0) {
//			msg = "3의 배수입니다.";
//		} else {
//			msg = "3의 배수가 아닙니다.";
//		}
//		
//		
//		System.out.println(msg);
//		
//		sc.close();
		
		
		//짝수인지 홀수인지 판별하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String msg;
		
		//if문
		if((num%2) != 0) {
			msg = "홀수입니다.";
		} else {
			msg = "짝수입니다.";
		}
		System.out.println(msg);
		
//		//삼항연산자
//		msg = ((num%2) != 0) ? "홀수입니다." : "짝수입니다.";
//		System.out.println(msg);
		
		sc.close();
	}
}
