package algo;

import java.io.*;
import java.util.*;

public class p12865 {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(read.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] W = new int[N+1];
		int[] V = new int[N+1];
		int[] temp = new int[K+1];
		
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(read.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i<=N; i++) {
			for(int j=K; j - W[i] >=0; j--) {
				temp[j] = Math.max(temp[j], temp[j-W[i]] + V[i]);
			}
		}
		
		System.out.println(temp[K]);

	}

}
