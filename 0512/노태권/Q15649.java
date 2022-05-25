import java.util.Scanner;
public class Q15649 { 
	// 자연수 n과 m이 주어질 때, 1부터 n까지 자연수 중, 중복없이 m개를 고른 수열

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //(1 <= m <= n <= 8)
		int n = sc.nextInt(); //~까지
		int m = sc.nextInt(); //수열 개수
		
		int[] nm = {};
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				System.out.println(j);
			}
		}
		
		

	}

}
