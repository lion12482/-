import java.util.Scanner;

public class Q2293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); // 동전의 개수
		int k = stdIn.nextInt(); // 가치의 합
		int arr[] = new int[n + 1];
		int dp[] = new int[k + 1];
		dp[0] = 1;
		
		for (int i = 1; i <= n; i++) {
			arr[i] = stdIn.nextInt();
			for (int j = arr[i]; j <= k; j++) {
				dp[j] += dp[j - arr[i]];
			}
		}
		
		System.out.println(dp[k]);
		
		

	}

}
