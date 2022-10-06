package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2293 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N];
		int[] dp = new int[K+1];
		
		for(int i=0; i<N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		for(int i=0; i<N; i++) {
			for(int j=coins[i]; j<=K; j++) {
				dp[j] += dp[j - coins[i]];
			}
		}
		
		System.out.println(dp[K]);
	}

}
