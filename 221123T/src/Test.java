
public class Test {

	public static void main(String[] args) {
		
		//���� 100, ���� 95������ �ʱ�ȭ
		
		int eng = 100;
		int kor = 95;
		
		System.out.println(eng);
		System.out.println(kor);
		
		//�Ǽ� float ���ٴ� double ���� ��
		double avg = (eng + kor)/2;
		
		System.out.println(avg); 
		
		
		/*
		 * �Ҽ����� ������ ������ ����� �̻��ϴ�.
		 * ���� ������ ������ �߰�,
		 * �׷� �������� �Ҽ����� ������
		 * 
		 * 97.5�� ���;� �ϴµ� 0.5�� ��������.
		 * ������ ���� �ϳ��� �Ǽ��� �ٲ���� �Ѵ�
		 */
		
		
		//1. �ڿ� ������ ���ڸ� �Ǽ��� �ٲٱ�
		double avg1 = (eng + kor)/2.0;
		System.out.println(avg1); 
		
		//2. �տ� �������� ���ڸ� �Ǽ��� �ٲٱ� (���� Ÿ�Ժ�ȯ)
		double avg2 = (double)(eng + kor)/2;
		System.out.println(avg2);
		
		//printf �� ����غ���
		double avg3 = (double)(eng + kor)/2;
		System.out.printf("�� ���� ����� %.1f���̴�\n", avg3);
		System.out.println("�� ���� ����� " +avg3 + "���̴�");
		

		
		
	}	

}
