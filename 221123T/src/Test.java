import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� ��������?");
		String day = s.next();
		
		//���� �Է��� ������ �������� �ν�
		
		switch(day) { //�Է°��� ���ڿ�
		case "������" :
			System.out.println("��");
			break; //break ���ٸ� ���� case������ ��� �Ѿ
		case "�����" :
			System.out.println("��");
			break;
		default: //case�� ���� �� ������ ����Ǵ� default��
			System.out.println("��,�� �ƴ�");
			break;
		}
	}
}