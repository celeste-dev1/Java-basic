
public class Test {

	public static void main(String[] args) {
		
		String name="�ǿ�";
		int age=20;
		double ki=177.7;
		char blood='O';
		
		/*
		 * printf�� println�� �̿��� ����Ͽ���.
		 * �ǿ��� ���̴� 20���̴�.
		 * �ǿ��� �������� O��
		 */
		
		System.out.println(name+"�� ���̴� " +age+ "���̴�");
		System.out.printf("%s�� ���̴� %d���̴�\n", name, age); // "\n" �� ���� ����
		
		System.out.println(name + "�� ���̴� " + age + "���̴�. \nŰ�� " 
		+ ki + "cm�̸� " + name +"�� �������� " + blood + "���̴�.");
		
		System.out.printf("%s�� ���̴� %d�̴�.%n%s�� �������� %c��%n",name,age,name,blood);
	}	

}
