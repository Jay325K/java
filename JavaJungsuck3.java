package Chapter4;

public class JavaJungsuck3 {
	public static void main(String args[]) {
		
		
//	3-3
//			int num = -10;
//			
//			System.out.println((num== 0) ? "0" : ( (num>0) ? "양수" : "음수"));
//			
		
//		int num=-4;   //예외 쌤이 보여주신거
//		if(num>0) {
//			System.out.println("양수");
//		}else if(num==0) {
//			System.out.println("0");
//		}else {System.out.println("음수");
//		}
//			
//			3-4
//			int num = 456;
		//	System.out.println( num - (num%100) ); 마이버전
		
//		System.out.println(num/100*100); 쌤버전
		
//		3-5
		
//		   int num = 777;
//		   System.out.println(num/10*10+1);
		 
		
//		3-6
		
		
//	int num = 81; /
		
//		배수 
//	2의 배수 0 1 2 4 6 8 16 32 64 128 ...  2로 나누면 나머지가 0
//	3의 배수 0 1 3 6 9 ...  3으로 나누면 나머지가 0
//	5의 배수 0 1 5 10 10 ... 5로 나누면 나머지가 0
		
//	배수라는 말이 나오면 나머지가 0인 것을 생각하라...
	
//	  if(num%3 == 0) {
//		System.out.println("3의 배수입니다.");
//	 }else {
//		 System.out.println("3의 배수가 아닙니다.");
//	 }
//		
//	System.out.println(10-num%10);/
//	     System.out.println((num/10*10 +10)-num);/


		
		
//		3-7
//		
//		37.7778 *100
//		3777.778 + 0.5 -> 3778.278
//		
//		int타입으로 변환 3778
//		
//		3778/100f   -> 37.78
//		
		//Last 
		
//		int fahrenheit = 100;
//	
//	    float celcius =5/9f *(fahrenheit - 32);
//	    
//       System.out.println(5/9f *(fahrenheit - 32));
//	     System.out.println(celcius*100);
//       System.out.println(Math.round(celcius*100));
//	     System.out.println(Math.round(celcius*100)/100.0);
//	     System.out.println(Math.round(celcius*100)/100);
	    
		
		
		
		
		
		
		
//		3-8
		
//		byte a = 10;
//		byte b = 20;
//		byte c =(byte) (a + b);
////		2) int c = a + b;
//		char ch = 'A';
//		ch = (char)(ch + 2);
//		float f = 3f / 2 ;
//		long l = 3000L * 3000 * 3000;
//		double f2 = 0.1f;
//		double d = 0.1;
//		boolean result = (float)d==f2;
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
		
		
		
		
		
		
		
		
		
		
		
//		결과 c=30
//		ch=C
//				f=1.5
//				l=27000000000
//				result=true
//		
//		
//		
		
		
//		3-9
//		System.out.println((65~90) || (97~122));
//		hint char ch1 = 'A';
//		
//		if('A'<=ch1 && ch1<='Z') {
//			System.out.println("대문자");
//		}
//				
//		System.out.println(b1);

//		char ch = '0';
		
		//  조건 ? 참일때 결과 : 거짓일 때의 결과
		
//		영문자 대문자 또는 소문자 이거나 숫자일 때만
		// 'a' <= ch  && ch<='z' 
		
//	    소문자 'a'~'z'  || 대문자 'A' ~ 'Z' || '0'~'9'
		
		
		
		
//		boolean b = ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')||('0'<=ch && ch<='9');
//		System.out.println(b);

		
		
		
		
//		3-10
		
//		char ch = 'A';
//		char lowerCase = ('A'<=ch && ch<='Z') ? (char)(ch+32) : ch;
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
