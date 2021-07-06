package Chapter4;

public class Jungsuck4 {
	public static void main(String arsg[]) {
		
		//4-1
//		int x = 19;
//		
//		if((x>10) && (x<20)) {
//			System.out.println("실행됨");
//		}
		
		
//		//4-2
		
//		char ch = ' ';
//		
//		// 공백이나 탭이 아닐 때
//		
//		// 1) 공백 아니고 탭도 아니다.
//		// 2) 공백이나 탭이 아니다.
//		
//		if (ch==' ' || ch!= '\t') {
//             			
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
		
		
//		tab설명   (참조 \n은 뭐지)
//		  System.out.println("hi"+"\t"+ "nice");
//		System.out.print("hi      "+"nice");
		
		
		
	
//		4-3
		
		
		
		
		
		
		
		
//		4-5
		
//		char ch = 'B';
//		
//		if( (ch>='A') && (ch<='Z') ) || ( (ch>='a') && (ch<='z') ){
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		} 에러 왜 뜨지ㅜ
		
//		4-6
		
//		int ch=3;
//	    
//		if(ch%400==0 || (ch%4==0) && (ch%100!=0)) {
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
		
		
		
		
//		4-7
		
//		boolean powerOn=false;
//		if(!powerOn) {
//			System.out.println("참");
//		}
//		
//		
//		String str="yes";
//		if(str.equals("yes")) {
//			System.out.println("같다");
//		}
//		
//	    String str2="yes";
//		if(str2.equals(str2)) {
//			System.out.println("같다");
//		}
		
		
		
		
//		찐 4-2
		
		
		int tot=0;
		
		for(int i=1;i<=20;i++) {

			if(i % 2 != 0 && i % 3 != 0) {  //2 또는 3의 배수가 아닌 수
	                    //  i % 2 == 0 	||	 i % 3 == 0
		                //  i%2!=0  && i%3!=0	
			
				tot=tot+i;
				
			}
		}
	System.out.println(tot);
		
		
		
		
	} 

}
