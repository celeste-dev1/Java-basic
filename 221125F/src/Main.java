import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
//		1. �� ���� ������ �Է��Ͽ� ��� ����ϴ� ���α׷�(����� �Ҽ��� ���� ù°�ڸ����� ���)
//		��� ���) �� ���������� : 70 80
//		��� : 75.0
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("ù���� ���� �Է�:");
		int a = s.nextInt();
		System.out.println("�ι�°���� ���� �Է�:");
		int b = s.nextInt();
		
		double avg = (a+b)/2.0;
		
		System.out.printf("�� ������ ���� : %d %d \n��� : %.1f", a, b, avg);
		
//		System.out.println("�� ������ ���� : " + a + " "+ b + "\n ��� : "+avg);
		
		
		
		
		
		
		
		
		
	}
}
