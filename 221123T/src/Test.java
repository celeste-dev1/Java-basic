
public class Test {

	public static void main(String[] args) {
		
		int a=3; //���� ����� ���ÿ� ���� �ʱ�ȭ (4byte)
		int b; //���� ���� (4byte)
		
		b=a; //a�� 3�� b�� ���� 
		System.out.println(b); //3 
		
		b=b+a; //3+3
		System.out.println(b); //6 

		b+=a; //b=b+a = 6+3
		System.out.println(b);
		
	}

}
