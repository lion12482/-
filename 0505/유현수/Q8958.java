package beakjoon;

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String[] O;
		int sum = 0;
		int tot = 0;
		
		for(int i=0; i<num; i++) {
			O = in.next().split("X");	// 'X'�� �������� ���ڿ��� ������(Divide strings by 'X')
										// 'O'�� �̷���� ���ڿ��� �迭�� �Է� ����(and receive an array of 'O' strings)
			for(int j=0; j<O.length; j++) {
				for(int o=1; o<=O[j].length(); o++)		sum += o;	// 'O'�� ������ ���� ����(Add according to the number of 'O's)
				tot += sum;				// ������ ������ ����(Adding points to the total score)
				sum = 0;				// ���� �ʱ�ȭ(Reset sum)
			}
			System.out.println(tot);	// ���(Output)
			tot = 0;					// ���� �ʱ�ȭ(Reset tot)
		}
		
	}

}
