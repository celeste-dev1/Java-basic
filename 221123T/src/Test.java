import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�����Է�:");
		//������ �Է¹޾ƶ�.
		
		int n = s.nextInt();
		System.out.println("������ " + n);
		
		if (n%2==0) {
			System.out.println("¦��, 2�� ����̴�");
		}
		else {
			System.out.println("Ȧ��, 2�� ����� �ƴϴ�");
		}
		

	}	

}
