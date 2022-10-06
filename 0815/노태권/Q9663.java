import java.util.Scanner;

public class Q9663 {
	public static boolean[] flag_a;  // �� �࿡ ���� ��ġ�ߴ��� üũ
	public static boolean[] flag_b; 	// �� �밢�� �������� ���� ��ġ�ߴ��� üũ
	public static boolean[] flag_c; 	// �� �밢�� �������� ���� ��ġ�ߴ��� üũ
	public static int[] pos; 		// �� ���� ���� ��ġ
	public static int count = 0;
	public static int N = 0;
	
	// i���� �˸��� ��ġ�� ���� ��ġ
	static void set(int i) {
		for (int j = 0; j < N; j++) {
			if (flag_a[j] == false &&
				flag_b[i + j] == false &&
				flag_c [i - j + (N-1)] == false) {
				pos [i] = j;
				if (i == N)
					count++;
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + (N-1)] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i- j + (N-1)]  = false; 
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		N = stdIn.nextInt();
		
		pos = new int[N];
		flag_a = new boolean[N];
		flag_b = new boolean[N * 2];
		flag_c = new boolean[N * 2];
		
		set(0);
		
		System.out.print(count);

	}

}

