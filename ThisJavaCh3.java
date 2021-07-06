package Chapter4;

public class ThisJavaCh3 {
	public static void main (String args[]) {
		
		
// 1. 연산자(operator) 산 관(비교) 논(&&, ||)
//		피연산자 -1     1 + 2  조건(true, false) ?  참일경우 : 거짓일 경우
		
		
//		연산식은 하나의 값이 나온다.
		
		
		
		
//1		답 2 /답 3인듯
		
		
		
//2  31
		
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z);
		
		
		
//3		나 //가임 ! 결과값을 바꿔줌 / 논리부정 논리연산자/ 논리 다음 조건 연산자
		
//		int score = 85;
//		String result = (!(score>90))? "가" : "나";
//		System.out.println(result);
		
		
//4   
//		int pencils = 534;
//		int students = 30;
//		
//		//학생 한 명이 가지는 연필 수 
//		int pencilsPerStudent = (pencils/students);
//		System.out.println(pencilsPerStudent);
//		
//		//남은 연필 수
//		int pencilsLeft = (pencils%students);
//		System.out.println(pencilsLeft);
		
		
		
//5 
		
//		int value = 356;
//		System.out.println(value - (value%100));
		
//6   정수에서 실수체계로 넘어가고싶으면, 변수 초기화 시 = 옆에 리터럴 위치에 (실수연산자)(정수) 적으면 됌
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		System.out.println((lengthTop+lengthBottom)*height/2);
//		double area = (double)((lengthTop+lengthBottom)*height)  /  (double)2;
//		System.out.println(area);
		
		
//		7
		
//		int x = 10;
//		int y = 5;
//		
//		System.out.println( (x>7) && (y<=5)); //true
//		System.out.println( (x%3 == 2) || (y%2 != 1)); // true / false 5%2 나머지는 1 1과1은 같은데 달라야 true가 뜨므로
		
		
		
//		8
//		NaN   not a number 
//		Exception(예외) 0으로 나눌 경우 예외가 발생한다.
//	    예외가 발생할 경우 예외 처리를 한다.
		
//	   System.out.println( 4/0.0 );
//		
//	   System.out.println( 4%0.0 ); // Not a number
	   
		
		
		
		
		
//		int x = 5;
//		double y = 0.0;
//		
//		double z1 = x / y;
//		double z2 = x % y;
//		boolean b1=Double.isInfinite(z1);
//		boolean b2=Double.isNaN(z2);
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		
		
		
		
		
		
		
		
		double x =5.0;
		double y =3;
		
		double z= x%y;
		
		
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다");
		}else {
			double result = z + 10;
			System.out.println("결과: "+ result);
			
			
			
			
			
			
		}
	}
}
		
		
		
		
		
		
		
		
		
	


