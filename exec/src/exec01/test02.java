package exec01;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.print("연산자를 입력하세요 : ");
		String c = sc.next();
		
		if(c.equals("+")) { 																				//입력받은 연산자가 +라면
			System.out.printf("입력된 연산자 : %s %n 연산 결과 : %d %s %d = %d", c, a, c, b, a+b);				//더하기
		} else if(c.equals("-")){																			//입력받은 연산자가 -라면
			if(a<b) {																						//첫 번째 입력받은 정수가 두 번째 입력받은 정수보다 작을 경우
			int x = a;																						//기존 식은 건드리지 않고 결과만 양수로 받기 위해 임의의 변수 x를 이용
				a = b;
				b = x;
			}
			System.out.printf("입력된 연산자 : %s %n 연산 결과 : %d %s %d = %d", c, a, c, b, a-b);
//			if(a>=b) {																						처음에 요구사항듣고 내가 짠 코드
//				System.out.printf("입력된 연산자 : %s %n 연산 결과 : %d %s %d = %d", c, a, c, b, a-b);			(의도에 맞지 않는 것 같아 의도대로 다시 작성한게 위의 코드)
//			} else {
//				System.out.printf("입력된 연산자 : %s %n 연산 결과 : %d %s %d = %d", c, b, c, a, b-a);
//			}
		} else if(c.equals("*")){																			//입력받은 연산자가 *라면
			System.out.printf("입력된 연산자 : %s %n 연산 결과 : %d %s %d = %d", c, a, c, b, a*b);				//곱하기
		} else if(c.equals("/")){																			//입력받은 연산자가 /라면
			System.out.printf("입력된 연산자 : %s %n 연산 결과 : %d %s %d = %d, 나머지=%d", c, a, c, b, a/b, a%b);	//나눗셈
		} else {																							//입력받은 연산자가 4가지 사칙연산이 아닐 경우
			System.out.println("연산자가 올바르지 않습니다.");
		}
		sc.close();
		
		
		
//		Scanner scan = new Scanner(System.in);
//	      float a, b, c, d; // float 사용한 이유: 나눗셈할때 나머지랑 몫따로 구해야되는거 귀찮아서
//	      float t; // 임시변수 선언
//	      
//	      System.out.println("첫번째 숫자를 입력하세요: ");
//	      a = scan.nextFloat();
//	      
//	      System.out.println("원하는 연산자를 입력하세요 (숫자로 입력): \n1) 더하기\n2) 빼기\n3) "
//	            + "곱하기\n4) 나누기 ");
//	      b = scan.nextFloat();
//	      
//	      System.out.println("두번째 숫자를 입력하세요: ");
//	      c = scan.nextFloat();
//	      
//	      if(b==1) {
//	         d = a+c;
//	         System.out.printf("당신이 고른 숫자는 %.2f와 %.2f이며"
//	               + "그 덧셈의 값은 %.2f입니다.\n", a,c,d);
//	      } else if(b==2) {    
//	         
//	         d = a-c;
//	         System.out.printf("당신이 고른 숫자는 %.2f와 %.2f이며"
//	               + "그 뺄셈의 값은 %.2f입니다.\n", a,c,d);
//	      } else if(b==3) {
//	         d = a*c;
//	         System.out.printf("당신이 고른 숫자는 %.2f와 %.2f이며"
//	               + "그 곱셈의 값은 %.2f입니다.\n", a,c,d);
//	      } else {
//	         d = a/c;
//	         System.out.printf("당신이 고른 숫자는 %.2f와 %.2f이며"
//	               + "그 나눈 값은 %.2f입니다.\n", a,c,d);
//	      }
		
		
		
	      /* 1. 스캐너로 숫자 두개 입력 + 연산자
	       * 2. 더하기 연산
	       * 3. 결과값 출력
	       * 
	       * 
	       * */
//	      int x = 0;
//	      
//	      if(조건1) {
//	         System.out.println("x는 0입니다.");
//	      } else if(조건2) {
//	            System.out.println("x는 0입니다.");
//	      } else {
//	         System.out.println("x는 0이 아닙니다.");
//	      }
	      
	      /* <계산기 만들기>
	       * 숫자를 두개 입력받고, 연산자를 입력받아서
	       * 해당 연산의 출력값만 보여주기
	       * 
	       * (추가)
	       * 뺄샘 연산시, 
	       * 현재 3,8 입력 : -5
	       * 개선 8,3 입력과 같게 : 5
	       * */

//	      Scanner scan = new Scanner(System.in);
//	      int a = 0;
//	      int b = 0;
//	      int temp = 0;
//	      int result = 0;
//	      float result2 = 0;
//	      String c = null;
//	      String msg = "";
//	      
//	      System.out.println("insert number : ");
//	      a = scan.nextInt();
//	      
//	      System.out.println("insert number : ");
//	      b = scan.nextInt();
//	      
//	      System.out.println("연산기호를 입력하세요.");
//	      c = scan.next();
//	      
//	      if(c.equals("+")) {
//	         result = a + b;
//	         msg = "연산결과 : "+ result;
//	      } else if (c.equals("-")) {
//	         if(a<b) {
//	            temp=b;
//	            b=a;
//	            a=temp;
//	         }
//	         result = a - b;
//	         msg = "연산결과 : "+ result;   
//	      } else if (c.equals("*")) {
//	         result = a * b;
//	         msg = "연산결과 : "+ result;
//	      } else if (c.equals("/")) {
//	         result2 = (float)a/b;
//	         msg = "연산결과 : "+ result2;
//	      } else {
//	         msg = "연산기호를 잘못 입력하셨습니다.";
//	      }
//
//	      System.out.printf(msg);

		
	}

}
