package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2156 {
	static int[] wine;
	static int[] value;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		wine = new int[n+1];
		value = new int[n+1];

		for(int i=1; i<=n; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		

		DP(n);
		
		System.out.println(value[n]);
	}
	
	public static void DP(int n) {
		value[1] = wine[1];
		if(n == 1) {
			return;
		}
		
		value[2] = wine[1] + wine[2];
		
		for(int i=3; i<=n; i++) {
			value[i] = Math.max(value[i-3] + wine[i-1] + wine[i], value[i-2] + wine[i]);
			value[i] = Math.max(value[i], value[i-1]);
		}
	}
}
