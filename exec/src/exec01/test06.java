package exec01;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
//		//1번 구구단출력
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d * %d = %d	  ", i, j, i*j);
//			}
//			System.out.println();
//		}


		/* 2번(for문1개), 3번(for문2개)문제
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		//2번
//		for(int i=0; i<=4;i++) {
//			System.out.println("*****");
//		}
		//3번
//		for(int i=0; i<=4;i++) {
//			for(int j=0; j<=4; j++) {
//				System.out.print("*");
//			}
//			System.out.printf("%n");
//		}


		/* 4번문제
		 * *
		 * **
		 * ***
		 * ****
		 * 출력
		 * */
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.printf("%n");
//		}


//		/* 5번
//		 * 주민번호 입력받아서 남자인지 여자인지 출력하기(regNo.charAt(7))
//		 * 계속 반복해서 입력받다가 "exit" 입력시 프로그램 종료
//		 * */
//		for(;;) {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.printf("주민등록번호를 입력해주세요 : ");			
//			String regNo = sc.next();									//주민등록번호 입력받기
//			
//			if(regNo.equals("exit")) {									//"exit"입력시 for문 종료
//				break;
//			} else {
//				char gender = regNo.charAt(7);
//				
//				if(gender == '1'||gender == '3') {						//남여 구분
//					System.out.println("남자입니다.");
//				} else if(gender == '2'||gender == '4') {
//					System.out.println("여자입니다.");
//				} else {
//					System.out.println("주민번호가 올바르지 않습니다");
//				}
//			}
//		sc.close();
//		}


	}
}
