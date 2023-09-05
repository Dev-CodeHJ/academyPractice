package exec01;

public class test12 {

	public static void main(String[] args) {
		//2차원배열
		
//		int[][] arr = {
//				{1,2,3},
//				{4,5,6}
//		};
//		for(int i=0; i<arr.length; i++){
//			System.out.printf("{");
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.printf("%d,",arr[i][j]);
//			}
//			System.out.printf("}");
//			System.out.println();
//		}
		
//		int sum = 0;
//		int[][] score = {
//							{100,100,100},
//							{20,20,20},
//							{30,30,30},
//							{40,40,40}
//						};
//		//score%d,%d=%d%n의 형태로 출력
//		//출력순서 100,100,100,20,20...
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("score(%d,%d)=%d%n",i,j,score[i][j]);
//				sum += score[i][j];
//			}
//		}
//		System.out.printf("점수의 총합 : %d",sum);
		
		/* 밑에 그림대로 출력하기
		 * 번호 국어 영어 수학 총점 평균
		 * =========================
		 * 1  100 100 100 300 100.0
		 * 2   20  20  20  60  20.0
		 * 3   30  30  30  90  30.0
		 * 4   40  40  40 120  40.0
		 * 5   50  50  50 150  50.0
		 * =========================
		 * 총점 240 240 240
		 */
		int sum;
		int[][] score = {
							{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40},
							{50,50,50}
						};
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("=============================");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d   ",i+1);
			sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%3d  ",score[i][j]);
				sum += score[i][j];
			}
			System.out.printf("%3d  %5.1f\n",sum,(float)sum/score[i].length);
		}
		System.out.println("=============================");
		System.out.printf("총점 ");
		for(int j=0; j<score[0].length; j++) {
			sum = 0;
			for(int i=0; i<score.length; i++) {
				sum += score[i][j];
			}
			System.out.printf("%3d  ",sum);
		}
	}

}
