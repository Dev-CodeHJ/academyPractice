package exec01;

public class test10 {

	public static void main(String[] args) {
		//연습문제 풀이
		//1번. 각 연산의 결과 확인
        int x=2;
        int y=5;
        char c='A';
      
        System.out.println(1 + x << 33);
        System.out.println(y>=5 || x<0 && x>2);				// true|| faluse && faluse
        													// true||false
        													// ture
        
        System.out.println(y+=10 - x++);					// y=y+10-x++
        													// y=5+10=2++
        													// y=5+8++
        													// y=13++
        													// y=13, x = 3
        
        System.out.println(x+=2);							// x = 5
     
        System.out.println(!('A'<=c && c<='Z'));				//false

        System.out.println('C'-c);							//67-65=2

        System.out.println('5'-'0');						//5
        
        System.out.println(c+1);							//66

        System.out.println(++c);							//B

        System.out.println(c++);							//B >> C

        System.out.println(c);								//C
        
        //2번.
        int numOfApples = 123;
        int sizeOfBucket = 10;
        
        int numOfBucket = numOfApples/sizeOfBucket;
        int a = numOfApples % sizeOfBucket;
      
        if(a==0) {
        	System.out.println(numOfBucket);
    	} else if(a!=0){
    		System.out.println(numOfBucket+1);
    	}
        
        //3번.
        int num = 10;
        System.out.println(num>0?"양수":num==0?"0":"음수");

        //4번. 백의 자리수 미만 버림
        int num1 = 456;
        System.out.printf("%d \n",num1-(num1%100));
        //400

        //5. 일의 자리수만 무조건 1이 되게
        int num3=335;
        int numb=((num3/10)*10)+1;
        System.out.printf("%d \n",numb);
        //331 
        
        //6.(num값보다 크면서 가장 가까운 10의 배수)-num=6
        int num4=34;
        System.out.println(10 - (num4%10));

        //7 화씨를 섭씨로 변환공식 c=5/9*(f-32),변환 결과값은 소수점 셋째자리에서 반올림
        int fah=100;
        float celcius = 5/9f*(fah-32);
        System.out.printf("celcius: %.2f\n",celcius);
 
        //8 수정하여 올바르게 출력되게 하라
        byte a1 =10;
        byte b1 =20;
        
        byte c1= (byte)(a1 + b1);
        System.out.printf("c1 = %d\n", c1);
        //30
        
        char ch = 'A';
        ch ='A'+2;
        System.out.println("ch="+ch);
        //C
        
        float f = 3/2f;
        System.out.printf("f=%.1f \n",f);
        //1.5

        long l = 3000*3000*3000L;
        System.out.printf("l= %d \n",l);
        //27000000000

        float f2 = 0.1f;
        double d = 0.1d;
        
        boolean result = (float)d==f2;
        
        System.out.println("result="+result); 
        //result=true
        
        //9  ch가 대문자 또는 소문자일때만 true가 나오게
        char ch1 ='G';
        boolean b = true;
        if('A'<=ch1 && ch1<='Z'||'a'<=ch1 && ch1<='z') {
           System.out.println(b);
        }else {
           System.out.println(!b);
        }
           
     //10 ch가 대문자인 경우에만 소문자로 변경 
        char ch3 = 'F';
        char lowerCase = 65<=ch3&&ch3<=96?(char)(ch3 + 32):ch3;
        // (1.조건)?(2.참):ch3;
       
        System.out.println("ch3:"+ch3);
        System.out.println("ch3 to lowerCase:"+lowerCase);
	}

}
