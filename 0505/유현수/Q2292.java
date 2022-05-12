package beakjoon;

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();		// �����ؾ� �ϴ� ��(A room to arrive in)
		int room = 1;				// �׵θ��� ���� ���� �� �ִ밪(Maximum number of rooms in the border)
		int cnt = 1;				// ������ �ϴ� ���� ����(Number of rooms to pass by)
		
		while(room < num) {
			room += 6 * cnt;
			cnt++;
		}
		System.out.println(cnt);
	}
}
// 1			1
// 2 ~ 7		6
// 8 ~ 19		12
// 20 ~ 37		18
// 38 ~ 61		24
// 62 ~ ...