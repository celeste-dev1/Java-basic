import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //ǥ�� �Է½�Ʈ��
		
		System.out.println("���� 5�� �Է�");
		int sum = 0;
		
//		int n=s.nextInt(); �̰� 5�� �� �ʿ䰡 ����! for�� �������.
		
		for(int i=0; i<5; i++) {    //Ƚ��
			int n=s.nextInt();      //5�� �Էµ�
			if(n<0) {
				continue;           //�ٽ� �ö󰡱� ������ sum����. (�ö󰡼� �ݺ��� �ٽý���)
			}
			else {                  //n>=0
				sum+=n;
			}
		}
		System.out.println(sum);
		
		
		
		
		
	}
}
