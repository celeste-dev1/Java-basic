import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		5. while, random()�� �̿��ؼ� (x,y)���·� ����ϴµ� x+y���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ�. 
//		5�� �ƴϸ� ���� ��� �߻���Ű����� (x,y ������ 1���� 5����)
		
		
		while (true) {
			int x = (int) (Math.random()*5)+1;
			int y = (int) (Math.random()*5)+1;
			
			System.out.println("(" + x + " , " + y + ")");
			
			if (x+y ==5) {
				break;
			}
		}
		
	

	}
}
