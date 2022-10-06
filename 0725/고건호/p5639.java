package algo;

import java.io.*;

public class p5639 {
	
	static int[] btree = new int[10000];
	static void bsearchtree(int start, int end) {
		int i;
		if(start>=end) {
			return;
		}
		for(i = start+1; i<end; i++) {
			if(btree[start] < btree[i])
				break;
		}
		bsearchtree(start+1, i);
		bsearchtree(i,end);
		System.out.println(btree[start]);
		return;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		String x;
		while((x = br.readLine()) != null) btree[i++] = Integer.parseInt(x);
		bsearchtree(0, i);
		
		
	}

}
