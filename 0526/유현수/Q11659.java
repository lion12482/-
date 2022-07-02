package baekjoon;

import java.util.Scanner;

public class Q11659 {

	public static void main(String[] args) {
		// Prefix Sum
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), M = in.nextInt();
		int[] sum = new int[N+1];
		
		sum[0] = 0;
		for(int i=1; i<=N; i++) {
			sum[i] = in.nextInt() + sum[i-1];
		}
		
		for(int i=0; i<M; i++) {
			System.out.println(-1 * sum[in.nextInt()-1] + sum[in.nextInt()]);
		}
	}

}
