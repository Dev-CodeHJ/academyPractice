package exec01;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		/* 1번.
		 * [1,1]
		 * 		[2,2]
		 * 			 [3,3]
		 * 				  [4,4]
		 * 					   [5,5]
		 */
		System.out.println("1번 문제");
		for(int i = 1; i<=5; i++) {							//for문
			for(int j = 1; j<=5; j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("     ");
				}
			}
			System.out.println();
		}
		
		int x = 1;											//while문
		while(x<=5) {
			int y = 1;
			while(y<=5) {
				if(x==y) {
					System.out.printf("[%d,%d]", x, y);
				} else {
					System.out.printf("     ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println();

		// 2번. 숫자를 입력받아 합을 구하는 프로그램 작성(0입력시 종료)
		System.out.println("2번 문제");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("합을 구하고자하는 숫자들을 입력하세요");
		while(true) {
			
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.printf("입력된 숫자들의 총합은 %d 입니다.%n%n", sum);
				break;
			}
			
			sum += num;
		}
		
		/* 3번.
		 * 숫자맞추기. 1~50까지의 수 중 컴퓨터가 생각한 값을 맞추면 종료.
		 * 사용자가 몇 번만에 맞췄는지 알려준다
		 * 컴퓨터가 사용자 입력보다 크면 up, 작으면 down
		 */
		System.out.println("3번 문제");
		int com = (int) (Math.random()*50)+1;									//while문
		int cnt = 0;
//		while(true) {
//			System.out.printf("컴퓨터의 숫자를 맞혀보세요 : ");
//			int user = sc.nextInt();
//			cnt++;
//			
//			if(com > user) {
//				System.out.println("Up");
//			} else if(com < user) {
//				System.out.println("Down");
//			} else {
//				System.out.println("정답입니다!");
//				System.out.printf("총 %d번만에 정답을 맞히셨습니다.%n%n", cnt);
//				break;
//			}
//		}
		int user;																//do-while문
		do {
			System.out.printf("컴퓨터의 숫자를 맞혀보세요 : ");
			user = sc.nextInt();
			cnt++;
			
			if(com > user) {
				System.out.println("Up");
			} else if(com < user) {
				System.out.println("Down");
			} else {
				System.out.println("정답입니다!");
				System.out.printf("총 %d번만에 정답을 맞히셨습니다.%n%n", cnt);
			}
		} while(com != user);
		
		sc.close();
		
		/* 4번.
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		System.out.println("4번 문제");
		for(int i = 5; i>=1; i--) {											//for문
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int a = 5;															//while문
		while(a>=1) {
			int b = 1;
			while(b<=a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a--;
		}
	}

}
