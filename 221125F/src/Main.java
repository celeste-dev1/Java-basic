import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		4. while���� �̿��ؼ� 1���� 100���� ���� �� 5�� ����� ������ ���
		
		int i=0;
		int total=0;
		
		while (i<=100) {
			if (i%5==0) {
				total+= i;
				i++;
			}
		}
		System.out.println(total);
	

	}
}
