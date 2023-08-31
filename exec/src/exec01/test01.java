package exec01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.printf("Hello!!! %n");
//		System.out.print("Hello!!!	  ");
//		System.out.println("Hello!!!  ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.printf("입력받은 수는 %d입니다. %n", a);
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.printf("입력받은 수는 %d입니다. %n", b);
		
//		System.out.print("첫 번째 정수를 입력하세요 : ");
//		int a = sc.nextInt();
		
//		System.out.print("두 번째 정수를 입력하세요 : ");
//		int b = sc.nextInt();

//		System.out.printf("%d + %d = %d %n", a, b, a+b);
//		System.out.printf("%d - %d = %d %n", a, b, a-b);
//		System.out.printf("%d * %d = %d %n", a, b, a*b);
//		System.out.printf("%d / %d = %d %n", a, b, a/b);
//		
		sc.close();
	}

}
