package algo;

import java.util.*;

public class p2293 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt(); // ������ ����
		int k = scan.nextInt(); // ��ġ�� ��
		int coin[] = new int[n];
		int dp[] = new int[k + 1];
		dp[0] = 1;
		
		for(int i = 0; i < n; i++) {
			coin[i] = scan.nextInt();
			for(int j = coin[i]; j <= k; j++) { 
				dp[j] += dp[j - coin[i]];
			}
		}
		
		System.out.println(dp[k]);
	}

}
