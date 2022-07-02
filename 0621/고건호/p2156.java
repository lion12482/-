package algo;

import java.util.*;

public class p2156 {
	static Integer[] depth;
	static int[] array;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		depth = new Integer[N+1];
		array = new int[N+1];
		
		for(int i=1; i<N; i++) {
			array[i] = scan.nextInt();
		}
		depth[0] = 0;
		depth[1] = array[1];
		
		if(N>1) {
			depth[2] = array[1] + array[2];
		}
		System.out.println(maxx(N));
	}
	
	static int maxx(int N) {
		if(depth[N] == null) {
			depth[N] = Math.max(Math.max(maxx(N-2), maxx(N-3) + array[N-1]) + array[N], maxx(N-1));
		}
		return depth[N];
	}

}
