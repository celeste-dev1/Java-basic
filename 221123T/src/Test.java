import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ڹ� ���� �Է��ض�:");
		//������ �Է¹޾ƶ�.
		
		int score = s.nextInt();
		System.out.println("�ڹ� ������ " + score);
		
		if (score >= 90) {
			System.out.println("�հ�!");
		}
		System.out.println("���հ�!");
		
		
	}	

}
