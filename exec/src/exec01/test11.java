package exec01;

public class test11 {

	public static void main(String[] args) {
		//배열
		
		//길이가 4인 배열에 1,2,3,4값 넣어서 출력
		int[] score = new int[4];
		for(int i = 0; i<score.length; i++) {
			score[i] = i+1;
			System.out.printf("score[%d] : %d\n", i, score[i]);
		}

		//길이가 7인 Arr배열에 1~10 사이의 숫자 랜덤으로 저장 & 출력
		int[] Arr = new int[7];
		for(int i=0; i<Arr.length;i++) {
			Arr[i] = (int)(Math.random()*10)+1;
			System.out.printf("Arr[%d] : %d\n", i, Arr[i]);
		}
		System.out.println();
		
		//Arr배열에서 인덱스가 짝수인 것만 값 출력(0제외)
		for(int i=1; i<Arr.length;i++) {
			Arr[i] = (int)(Math.random()*10)+1;
			if(i%2==0) {
				System.out.printf("Arr[%d] : %d\n", i, Arr[i]);
			}
		}
		System.out.println();
		
		//Arr배열에서 저장된 값이 짝수인 것만 출력
		for(int i=0; i<Arr.length;i++) {
			Arr[i] = (int)(Math.random()*10)+1;
			if(Arr[i]%2==0) {
				System.out.printf("Arr[%d] : %d\n", i, Arr[i]);
			}
		}
		
		//1,2,3,4,5의 값을 가지고 있는 길이가 5인 Arr1배열을,10개의 값을 저장할수 있는 배열로 만드시오.
		int[] Arr1 = new int[5];
		int[] Arr2 = new int[10];
		for(int i=0; i<Arr1.length; i++) {
			Arr1[i] = i+1;
			Arr2[i] = Arr1[i];
			System.out.printf("Arr1[%d] : %d\n",i ,Arr1[i]);
		}
		System.out.println();
		Arr1 = Arr2;
		for(int i=0; i<Arr1.length; i++) {
			System.out.printf("Arr1[%d] : %d\n",i ,Arr1[i]);
		}
		
		//100,88,100,100,90 score배열에 저장 후 총합, 평균 print
		int[] score0 = {100, 88, 100, 100, 90};
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += score0[i];
		}
		System.out.printf("총합 : %d\n평균 : %f", sum, (float)sum/score0.length);
		
		//79, 88, 91, 33, 100, 55, 95 값을 score배열에 저장 후 최대값, 최소값 print
		int[] score1 = {79, 88, 91, 33, 100, 55, 95};
		int max = score1[0];
		int min = score1[0];
		for(int i=1; i<score1.length; i++) {
			if(score1[i] > max) {
				max = score1[i];
			}
			if(score1[i] < min) {
				min = score1[i];
			}
		}
		System.out.printf("최대값 : %d\n최소값 : %d", max, min);

		
		//1.크기가 10인 numArr의 배열에 0~9까지의 값 저장
		//2.배열에 저장된 값이 랜덤하게 섞일수 있도록 프로그램 작성
	    //Math.random사용해서 0~9까지의 값 가져오기.
	    //배열에 있는 수 바꿔주기(temp 변수)
		int[] numArr = new int[10];
		int temp = 0;
		int rN = 0;
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
		}
	    for(int i=0;i<100;i++) {
	    	//2.
	    	rN = (int)(Math.random()*10);
    		temp = numArr[rN];
    		numArr[rN] = numArr[i%10];
    		numArr[i%10] = temp;
	    }
	    for(int i=0;i<numArr.length;i++) {
	    	System.out.printf("numArr[%d] : %d\n", i, numArr[i]);
    	}
		
		//로또 번호 생성하기
		int[] ball = new int[45];
		//1.ball의 배열에 1~45의 값을 저장하기.
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
	    int temp1 = 0;
	    int j = 0;
	    for(int i=0;i<6;i++) {
	    //2.0~44까지 임의의 값을 얻는다.
	    //2.배열 0부터 5번째까지 모두 바꾼다.
	    	j = (int)(Math.random()*45);
	    	temp1 = ball[i];
	    	ball[i] = ball[j];
	    	ball[j] = temp1;
	    }
	    //3.물음표 내용 채우기
	    for(int i=0;i<6; i++) {
	    	System.out.printf("ball[%d]=%d%n",i ,ball[i]);
	    }
	    
	}

}
