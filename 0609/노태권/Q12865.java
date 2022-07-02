import java.util.*;
public class Q12865 {
	static int bp[][];
	static int w[], v[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �ʿ��� ��ǰ = n, ���� = w, ��ġ = v -> v��ŭ ��� �� ���� k = ��ƿ �� �ִ� ����
		// n(1 <= n <= 100) k(1 <= k <= 100,00) v(0 <= v <= 1,000) (all ����)
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		

		bp = new int[n+1][k+1];
		w = new int [n+1];
		v = new int [n+1];
		
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt(); // w = ����
			v[i] = sc.nextInt(); // v = ��ġ
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if (w[i] > j) {
					bp[i][j] = bp[i - 1][j];
				}
				else {
					bp[i][j] = Math.max(bp[i - 1][j], bp[i - 1][j - w[i]] + v[i]);
				}
			}
		}
		System.out.println(bp[n][k]);
		
	}

}
