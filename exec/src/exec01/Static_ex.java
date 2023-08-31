package exec01;

//class Score{
//    static int num1 = 0; //클래스 필드
//    int num2 = 0; //인스턴스 필드
//}

public class Static_ex {
	
    public static void main(String[] args) {
//    	Score raise = new Score(); //첫번째 number
//    	Score check = new Score(); //두번째 number
//    	
//    	raise.num1++; //클래스 필드 num을 1증가시킴
//    	raise.num2++; //인스턴스 필드 num을 1증가시킴
//    	System.out.println(check.num1); //두번째 number의 클래스 필드 출력
//    	System.out.println(check.num2); //두번째 number의 인스턴스 필드 출력
    	
//    	System.out.println("1"+"2");
//    	System.out.println(true + "");	//문자열이라서 true도 문자열로 출력
//    	System.out.println('A'+'B');	//char는 크기가 작아서 int로 변환
//    	System.out.println('1'+2);
//    	System.out.println('1'+'2');
//    	System.out.println('J'+"ava");
//    	System.out.println(true + null);
    	
    	byte b = 10;
    	char ch = 'A';
    	int i = 100;
    	long l = 1000L;
    	
    	b = (byte)i;
    	System.out.println();
    	ch = (char)b;
    	short s = (short)ch;
    	float f = (float)l;
    	i = (int)ch;
    }
}
