package exec01;

public class test11 {

	public static void main(String[] args) {
		//배열
		
//		//길이가 4인 배열에 1,2,3,4값 넣어서 출력
//		int[] score = new int[4];
//		for(int i = 0; i<score.length; i++) {
//			score[i] = i+1;
//			System.out.printf("score[%d] : %d\n", i, score[i]);
//		}

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
	}

}
