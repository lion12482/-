import java.util.Scanner;
public class Q1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0; // �ݺ� Ƚ��
		System.out.print("���� �Է�(0 ~ 99)> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // �Է� ���� ��
		int copy = num; // �ݺ��ؼ� ���� ���� ������ ���� 
		
		while(true) {
		num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
		
		count++;
		System.out.println(num);
		
		if (copy == num){
			break;
		}
		}
		System.out.print("�ݺ�Ƚ��: " + count);
	}

}
