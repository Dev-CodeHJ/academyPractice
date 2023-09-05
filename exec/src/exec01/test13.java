package exec01;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		String name = "홍길동";
	    int age = 20;
		//연습문제 5-1
		// 다음 배열을 선언하거나 초기화한 것 중 잘못된 것을 고르고 그 이유를 설명하시오.
		// 정답 : d, e
//		a.int[] arr[];
//		b.int[] arr = {1,2,3,};
//		c.int[] arr = new int[5];
//		d.int[] arr = new int[5] {1,2,3,4,5}; = 생성을 두 번해줘서?
//		e.int arr[5]; = 배열 생성은 직접 값을 넣어주던가 아니면 new를 통해 해줘야함, 직접적으로 길이를 선언부에 지정해줄 수 없음
//		f.int[] arr[] = new int[3][];
//		System.out.println(arr);
		
		//연습문제 5-2
		//다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
		//정답 : 2
//		int[][] arr = {
//				{5,5,5,5,5},
//				{10,10,10},
//				{20,20,20,20},
//				{30,30}
//		};
//		System.out.println(arr[3].length);
		
		//연습문제 5-3
		//배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
//		int[] arr = {10,20,30,40,50};
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.printf("sum : %d",sum);
		
		//연습문제 5-4
		//2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
//		int[][] arr = {
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//		};
//		int total = 0;
//		float average = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				total += arr[i][j];
//			}
//		}
//		average = (float)total/(arr.length*arr[0].length);
//		
//		System.out.printf("total : %d\naverage : %.2f",total,average);
		
		//연습문제 5-5
		//1과9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만드는 프로그램을 완성하시오.
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		
//		for(int i=0; i<ballArr.length; i++) {
//			int j = (int)(Math.random()*ballArr.length);
//			int tmp = 0;
//			
//			tmp = ballArr[0];
//			ballArr[0] = ballArr[j];
//			ballArr[j] = tmp;
//		}
//		System.arraycopy(ballArr, 0, ball3, 0, ball3.length);
////		for(int i=0; i<ball3.length; i++) {
////			ball3[i] = ballArr[i];
////		}
//		for(int i=0; i<ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
		
		//연습문제 5-6
		//다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 문제
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		//단, 가능한 적은 수의 동전으로 거슬러줘야함.
//		int[] coinUnit = {500,100,50,10};
//		int money = 2680;
//		System.out.printf("money : %d\n",money);
//		
//		for(int i=0;i<coinUnit.length;i++) {
//			System.out.printf("%d원 : %d\n",coinUnit[i],money/coinUnit[i]);
//			money %= coinUnit[i];
//		}
		
		//연습문제 5-7
		//5-6에 동전의 개수를 추가한 프로그램이다.
		//커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
		//보유한 동전의 개수로 거스름돈을 지불할 수 없으면, "거스름돈이 부족합니다."라고 출력 후 종료.
		//지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("금액을 입력하세요 : ");
//		int money = Integer.parseInt(sc.nextLine());
//		System.out.printf("money : %d\n",money);
//		
//		int[] coinUnit = {500,100,50,10};
//		int[] coin = {5,5,5,5};
//		
//		for(int i=0;i<coinUnit.length;i++) {
//			int coinNum = 0;
//			coinNum = money/coinUnit[i];
//			if(coin[i]>=coinNum) {
//				coin[i] -= coinNum;
//			} else {
//				coinNum = coin[i];
//				coin[i] = 0;
//			}
//			money -= coinUnit[i]*coinNum;
//			System.out.printf("%d원 : %d\n",coinUnit[i],coinNum);
//		}
//		if(money>0) {
//			System.out.println("거스름돈이 부족합니다.");
//		} else {
//			System.out.println("남은 동전의 개수");
//			for(int i=0;i<coinUnit.length;i++) {
//				System.out.printf("%d월 : %d\n",coinUnit[i],coin[i]);
//			}
//		}
		
		//연습문제 5-8
		//배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램을 완성하세요.
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0;i<answer.length;i++) {
			counter[answer[i]-1]++;
		}
		
		for(int i=0;i<counter.length;i++) {
			System.out.print(counter[i]);
			for(int j=0;j<counter[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
