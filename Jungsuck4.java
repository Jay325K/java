package Chapter4;

public class Jungsuck4 {
	public static void main(String arsg[]) {
		
		//4-1
//		int x = 19;
//		
//		if((x>10) && (x<20)) {
//			System.out.println("�����");
//		}
		
		
//		//4-2
		
//		char ch = ' ';
//		
//		// �����̳� ���� �ƴ� ��
//		
//		// 1) ���� �ƴϰ� �ǵ� �ƴϴ�.
//		// 2) �����̳� ���� �ƴϴ�.
//		
//		if (ch==' ' || ch!= '\t') {
//             			
//			System.out.println("��");
//		}else {
//			System.out.println("����");
//		}
		
		
//		tab����   (���� \n�� ����)
//		  System.out.println("hi"+"\t"+ "nice");
//		System.out.print("hi      "+"nice");
		
		
		
	
//		4-3
		
		
		
		
		
		
		
		
//		4-5
		
//		char ch = 'B';
//		
//		if( (ch>='A') && (ch<='Z') ) || ( (ch>='a') && (ch<='z') ){
//			System.out.println("��");
//		}else {
//			System.out.println("����");
//		} ���� �� ������
		
//		4-6
		
//		int ch=3;
//	    
//		if(ch%400==0 || (ch%4==0) && (ch%100!=0)) {
//			System.out.println("��");
//		}else {
//			System.out.println("����");
//		}
		
		
		
		
//		4-7
		
//		boolean powerOn=false;
//		if(!powerOn) {
//			System.out.println("��");
//		}
//		
//		
//		String str="yes";
//		if(str.equals("yes")) {
//			System.out.println("����");
//		}
//		
//	    String str2="yes";
//		if(str2.equals(str2)) {
//			System.out.println("����");
//		}
		
		
		
		
//		�� 4-2
		
		
		int tot=0;
		
		for(int i=1;i<=20;i++) {

			if(i % 2 != 0 && i % 3 != 0) {  //2 �Ǵ� 3�� ����� �ƴ� ��
	                    //  i % 2 == 0 	||	 i % 3 == 0
		                //  i%2!=0  && i%3!=0	
			
				tot=tot+i;
				
			}
		}
	System.out.println(tot);
		
		
		
		
	} 

}
