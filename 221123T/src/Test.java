import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		//1. 10/4 �� ������� �Ҽ������� ����ض�
		
		double div = (double) 10/4;
		System.out.println(div);
		
		//���� ���� ���ϰ�
		System.out.println((double)10/4);
		
		
		//2. �ϳ��� ������ �Է¹޾� �� ���� ������ ���ض�.
		Scanner s=new Scanner(System.in);
		System.out.println("���� �Է�:");
		int x = s.nextInt();
		
		System.out.println(x*x);
		
		// 3. a�� 4.0, b�� 1.2�� �ʱ�ȭ�Ͽ� 4.0+1.2�� printf�� ����ض�.
		//    ���� ���) 4.0+1.2=5.2
		
		double a=4.0, b=1.2;
		double sum = a+b;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, sum);

		//3-1. �տ��� ����� 5.2�� �Ҽ����� ������.
		System.out.println((int)(a+b));
		
		// 4. ScannerŬ������ �̿��Ͽ� �̸�, ��� ��, ����, ü���� �Է¹ް�, ����ϴ� ���α׷� �ۼ��ض�.
		
		System.out.println("�Է��ض�:");
		
		String name = s.next();
		String city = s.next();
		int age = s.nextInt();
		double weight = s.nextDouble();
		
		System.out.println("�� �̸��� " + name +"�̴�.");
		System.out.println("��� ���� " + city +"�̰�, ���̴� " +age+"���̴�.");
		System.out.println("�����Դ� " + weight +"kg�̴�.");
		
		

		
	}	

}
