
public class Test {

	public static void main(String[] args) {
		
		int age=30; //����
		double ki=177.7; //�Ǽ�
		String name="jack"; //���ڿ�
		char grade='A'; //�ϳ��� ���ڿ�
		
		/*
		 * println : �ٹٲ�
		 * printf :
		 * print : �ٹٲ� ���� ���
		 * 
		 * <printf �� ����Ҷ� ���̴� ���Ĺ��ڵ�>
		 * ���� %d
		 * �Ǽ� %f, %lf
		 * ���ڿ� %s
		 * ���� %c
		 */
		
		System.out.println(age + " " + ki + name + grade);
		System.out.printf("%d %f %s %c", age, ki, name, grade);

		//�Ǽ��� 6�ڸ��� �⺻�̶� ���ڸ����� �ϰ������ ��������
		System.out.printf("%d %.2f %s %c", age, ki, name, grade);
		
	}	

}
