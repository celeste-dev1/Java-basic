import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str; //���� ����
		
		do {
			System.out.println("���ڿ� �Է�:");
			str = s.next();

			if (str.equals("exit")) {
				System.out.println("���α׷� ����");
			}
			else {
				System.out.println(str);
			}

		}while(!str.equals("exit"));
		

	}
}
