package exec01;

import java.util.Arrays;

public class test07 {
//		for문 연습문제
	public static void main(String[] args) {
//		/* 1번.
//		 * 111
//		 * 112
//		 * 113
//		 * 121
//		 * 122
//		 * 123
//		 */
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=3; j++) {
//				for(int k=1; k<=3; k++) {
//					System.out.printf("%d%d%d%n", i, j, k);
//				}
//			}
//		}


//		/* 2번.
//		 * [1,1][1,2][1,3][1,4][1,5]
//		 * [2,1][2,2][2,3][2,4][2,5]
//		 * ...[5,5]
//		 */
//		for(int i = 1; i<=5; i++) {							//배열사용x
//			for(int j = 1; j<=5; j++) {
//				System.out.printf("[%d,%d]", i, j);
//			}
//			System.out.println();
//		}
//		int[] a = new int[2];								//배열사용
//		for(int i = 1; i<=5; i++) {
//			a[0] = i;
//			for(int j = 1; j<=5; j++) {
//				a[1] = j;
//				System.out.print(Arrays.toString(a));
//			}
//			System.out.println();
//		}


//		/* 3번.
//		 * [1,1]
//		 * 		[2,2]
//		 * 			 [3,3]
//		 * 				  [4,4]
//		 * 					   [5,5]
//		 */
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=5; j++) {
//				if(i==j) {
//					System.out.printf("[%d,%d]", i, j);
//				} else {
//					System.out.print("     ");
//				}
//			}					
//			System.out.println();
//		}
		
//		/* 4번.
//		 * *****
//		 * ****
//		 * ***
//		 * **
//		 * *
//		 */
//		for(int i = 5; i>=1; i--) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}


//		--------------------------------------------------------------------------------------------------------


		//문제1) 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum1 = 0;
		for(int i = 1; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum1 += i;
			}
		}
		System.out.println("1번 문제");
		System.out.println(sum1);
		System.out.println();


		//문제2)1+(1+2)+(1+2+3)+(1+2+3+4)+.....+(1+2+3+4+5+6+7+8+9+10) 의 결과를 계산하시오.
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum2 += j;
			}
		}
		System.out.println("2번 문제");
		System.out.println(sum2);
		System.out.println();


		//문제3)1+(-2)+3+(-4)+....과 같은 식으로 계속 더해나갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int sum3 = 0;
		for(int i=1;;i++) {
			if((i%2)!=0) {
				sum3 += i;
			} else {
				sum3 += (-i);
			}
			if(sum3>=100) {
				System.out.println("3번 문제");
				System.out.println(i);
				System.out.println();
				break;
			}
		}


		//문제4) 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		System.out.println("4번 문제");
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if((i+j)==6) {
					System.out.printf("(%d,%d)", i, j);
				}
			}
		}
		System.out.println();


		//문제5)1~6사이의 임의의 정수를 변수 value에 저장하고 그 값을 출력하는 코드를 완성하라.
		int value = (int) ((Math.random()*6)+1);
		System.out.printf("%n5번 문제%n");
		System.out.println(value);
		System.out.println();


		//문제6)방정식 2x+4y=10의 모든 해를 구하시오. x,y는 정수이고, 범위는 0<=(x,y)<=10
		System.out.println("6번 문제");
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if((2*x)+(4*y)==10) {
					System.out.printf("x=%d, y=%d%n", x, y);
				}
			}
		}
		
	}
}
