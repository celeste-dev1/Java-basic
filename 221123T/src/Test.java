import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * <Scanner Ŭ����>
		 * 
		 * System.in ���� Ű�� �а� �ϰ�, ���� ����Ʈ�� ����, ����, �Ǽ�, �Ҹ���, ���ڿ� �� �پ��� Ÿ������ ��ȯ�Ͽ� ����
		 * Scanner a = new Scanner(System.in);
		 * 
		 * import���� �ʿ�� �Ѵ�.
		 * import java.util.Scanner;
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		//System.in���� Ű���尪�� �а� �ϱ� ���� Scanner��ü �����ؾ� ��
		//Ŭ������ ��ü�� = new Ŭ������
		
		System.out.println("������ �̸� �Է����ּ���");
		String name = s.next(); //s�� scanner ��ü
		System.out.println("�� �̸��� "+ name);
		//�̷��� �ϸ� �ܼ�â�� �̸��� ���� �� �ִ�!!!!!!! �����ϸ� ��µ�...!!!
		//���̽��� input �޴°Ŷ� ����Ѱǰ�..?
		
		System.out.println("������ ���� �Է����ּ���");
		int age = s.nextInt();
		System.out.printf("�� ���̴� %d��\n", age);
		
		System.out.println("������ Ű �Է����ּ���");
		double height = s.nextDouble();
		System.out.println("�� Ű�� "+ height);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+b);
		
	}	

}
