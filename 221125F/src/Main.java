import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //ǥ�� �Է½�Ʈ��
		
		int sum=0, n=100;
		
		while(n!=0) { //0�� �ƴҶ�
			System.out.println("�Է��ض� ");
			n=s.nextInt(); //���� �Է���(0�� �Էµ� ������)
			sum+=n; //sum=sum+n; //���� �Է��� �� �� ����
		}
		
		System.out.println(sum);
		
		s.close(); //�ݾƾ��� �޸� ���� ���� ����
		
		
		
		
		
		
	}
}
