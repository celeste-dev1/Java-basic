import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		2. �ð��� ���� ������ �ݾ� �������ִ� ���α׷�
//		(�� �ݾ��� 10�������� ����, �ð������� ������ �Է¹ޱ�)
//		14�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 3�� �����̸� 5%�� ����
//		18�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 5�� �����̸� 10%�� ����
//		20�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 10�� �����̸� 20%�� ����
		
		Scanner s = new Scanner(System.in); 
		int total = 100000;
		
		System.out.println("�ð� �Է�:");
		int time = s.nextInt();
		System.out.println("���� ���� �Է�:");
		int count = s.nextInt();
		
		if (time<=14) {
			if (count<=3) {
				total *= 0.95;
			}
		}
		else if (time<=18) {
			if (count<=5) {
				total *= 0.9;
			}
		}
		else if (time<=20) {
			if (count<=10) {
				total *= 0.8;
			}
		}
		System.out.println(total);
		
		//case-switch ����Ѵٸ�
		
//		switch(time) {
//		case 14 :
//			if (count <= 3) {
//				total *= 0.95;
//			}
//			break;
//		case 18:
//			if (count <= 5) {
//				total *= 0.9;
//			}
//			break;
//		case 20:
//			if (count <= 10) {
//				total *= 0.8;
//			}
//			break;
//		default:
//			System.out.println(total);
//		}
		
		
		
	}
}
