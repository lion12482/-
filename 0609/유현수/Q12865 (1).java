package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12865 {
	static int[] value;
	static int[] weight;
	static int[][] knapsack;
	static int N, K;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		knapsack = new int[N+1][K+1];
		value = new int[N+1];
		weight = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		DP();
		
		System.out.println(knapsack[N][K]);
		
		
	}
	
	public static void DP() {
		for(int i=0; i<=N; i++) {
			
			for(int j=0; j<=K; j++) {
				
				if(i == 0 || j == 0) {
					knapsack[i][j] = 0;
					continue;
				}
				
				if(j >= weight[i]) {
					
					if(knapsack[i-1][j] < value[i] + knapsack[i-1][j-weight[i]]) {
						knapsack[i][j] = value[i] + knapsack[i-1][j-weight[i]];
						
					} else {
						knapsack[i][j] = knapsack[i-1][j];
					}
					
				} else {
					knapsack[i][j] = knapsack[i-1][j];
				}
				
			}
		}
	}
}
