
public class Test {

	public static void main(String[] args) {
		
		int a,b = 4;
		a = b++;

		System.out.println(a); //4
		System.out.println(b); //5
		
		/* 
		 <����������>
		 1������ ������, ������ �����ĸ� �����Ѵ�
		 ���� �������̱� ������, ������ ���� �� �� ���߿� ������Ű�ڴٴ� ��.
		*/
		
		int c,d = 4;
		c = ++d;
		
		System.out.println(c); //5
		System.out.println(d); //5
		
		/* 
		 ���� �������̱� ������, ���� ��Ű�� ����.
		*/
		
	}

}
