import java.util.*;
public class Q12865 {
	static int bp[][];
	static int w[], v[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여행 필요한 물품 = n, 무개 = w, 가치 = v -> v만큼 즐길 수 있음 k = 버틸 수 있는 무개
		// n(1 <= n <= 100) k(1 <= k <= 100,00) v(0 <= v <= 1,000) (all 정수)
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		

		bp = new int[n+1][k+1];
		w = new int [n+1];
		v = new int [n+1];
		
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt(); // w = 무개
			v[i] = sc.nextInt(); // v = 가치
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
