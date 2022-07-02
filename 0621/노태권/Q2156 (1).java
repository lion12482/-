import java.util.Scanner;
public class Q2156 {
	static int w[]; // 와인 잔 수
	static Integer dp[]; // 잔에 차있는 와인 용량
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	    w = new int [n + 1]; 
	    dp = new Integer [n + 1];
		
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		dp[1] = w[1];
		
		if (n > 1) {
			dp[2] = w[1] + w[2];
		}
		
		System.out.println(recur(n));
	}
	
	static int recur(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(Math.max(recur(n - 2), recur(n - 3) + w[n - 1]) + w[n], recur(n - 1));
		}
		
		return dp[n];
		
	}

}
