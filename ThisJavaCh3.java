package Chapter4;

public class ThisJavaCh3 {
	public static void main (String args[]) {
		
		
// 1. ������(operator) �� ��(��) ��(&&, ||)
//		�ǿ����� -1     1 + 2  ����(true, false) ?  ���ϰ�� : ������ ���
		
		
//		������� �ϳ��� ���� ���´�.
		
		
		
		
//1		�� 2 /�� 3�ε�
		
		
		
//2  31
		
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z);
		
		
		
//3		�� //���� ! ������� �ٲ��� / ������ ��������/ �� ���� ���� ������
		
//		int score = 85;
//		String result = (!(score>90))? "��" : "��";
//		System.out.println(result);
		
		
//4   
//		int pencils = 534;
//		int students = 30;
//		
//		//�л� �� ���� ������ ���� �� 
//		int pencilsPerStudent = (pencils/students);
//		System.out.println(pencilsPerStudent);
//		
//		//���� ���� ��
//		int pencilsLeft = (pencils%students);
//		System.out.println(pencilsLeft);
		
		
		
//5 
		
//		int value = 356;
//		System.out.println(value - (value%100));
		
//6   �������� �Ǽ�ü��� �Ѿ�������, ���� �ʱ�ȭ �� = ���� ���ͷ� ��ġ�� (�Ǽ�������)(����) ������ ��
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
//		System.out.println( (x%3 == 2) || (y%2 != 1)); // true / false 5%2 �������� 1 1��1�� ������ �޶�� true�� �߹Ƿ�
		
		
		
//		8
//		NaN   not a number 
//		Exception(����) 0���� ���� ��� ���ܰ� �߻��Ѵ�.
//	    ���ܰ� �߻��� ��� ���� ó���� �Ѵ�.
		
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
			System.out.println("0.0���� ���� �� �����ϴ�");
		}else {
			double result = z + 10;
			System.out.println("���: "+ result);
			
			
			
			
			
			
		}
	}
}
		
		
		
		
		
		
		
		
		
	


