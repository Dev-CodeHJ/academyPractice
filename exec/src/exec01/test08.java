package exec01;

import java.util.Scanner;

public class test08 {
	//while문
	public static void main(String[] args) {
//		/* 주민번호 입력받아서 남자인지 여자인지 출력하기(regNo.charAt(7))
//		 * 계속 반복해서 입력받다가 "exit" 입력시 프로그램 종료
//		 * */
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("=======================");
//	        System.out.println("주민번호를 입력하세요. :");
//	        System.out.println("ex)901231-4447777");
//	        System.out.println("(종료시 'exit' 입력)");
//	        System.out.println("=======================");
//			
//			String regNo = sc.next();									//주민등록번호 입력받기
//			
//			if(regNo.equals("exit")) {									//"exit"입력시 while문 종료
//				System.out.println("입력이 종료되었습니다!");
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


//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		while문으로 변경
//		int i = 0;
//		while(i<=10) {
//			int j = 0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}


//		//2. 숫자를 입력받아서 합을 구하려는 프로그램 작성(0입력시 종료)
//
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		
//		System.out.println("숫자를 입력해주세요");
//		
//		while(true) {
//			int num = sc.nextInt();
//			sum += num;
//			if(num==0) {
//				break;
//			}
//		}
//		System.out.println(sum);
//		sc.close();


		//3. 숫자맞추기 게임. 1~50까지의 수 중에서 컴퓨터가 생각한 값을 맞추면 게임 종료.
		//컴퓨터가 생각한 수보다 적거나 크면 업다운 말해주기
		//사용자가 숫자를 맞추면 몇번만에 맞췄는지 알려준다
		Scanner sc = new Scanner(System.in);
		int computer = (int) (Math.random()*50)+1;
		int cnt = 0;
		
		System.out.println("컴퓨터의 숫자를 맞혀보세요");
		
		while(true) {
			System.out.printf("정답 : ");
			int user = sc.nextInt();

			if(user>computer) {
				System.out.printf("Down%n");
			} else if(user<computer){
				System.out.printf("Up%n");
			} else {
				System.out.printf("정답은 %d입니다.%n", user);
				System.out.printf("오답횟수 : %d", cnt);
				break;
			}
			cnt++;
		}
		sc.close();
		
	}

}
