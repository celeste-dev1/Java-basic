import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //ǥ�� �Է½�Ʈ��
		
		while(true) {
			//���ѹݺ��� (���ѷ���) ���� ����� -> break���
			
			System.out.println("�̸� �Է�");
			String name = s.next();
			
			//���ڿ��񱳴� "==" ��� ���ϰ� equals ���ٿ�����(.)�� ���� �������� �Ѵ�.
			if(name.equals("����")) {
				break; //���ѹݺ��� ����
			}
			System.out.println(name);
			
		}
		
		s.close(); //�ݾƾ��� �޸� ���� ���� ����
		
		
		
		
		
		
	}
}
