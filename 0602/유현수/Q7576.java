package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {
	static int[][] box;
	static Queue<int[]> queue = new ArrayDeque<>();
	static int cnt = 0;
	static int cnt_ = 0;
	static int day = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
		box = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if(box[i][j] == 1) {
					int[] index = {i, j};
					queue.offer(index);
				} else if(box[i][j] == 0){
					cnt++;
				}
			}
		}
		
		bfs();
		if(cnt == cnt_) {
			System.out.println(day-1);
		} else {
			System.out.println(-1);
		}
	}
	
	public static void bfs() {
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0; i<size; i++) {
				int[] index = queue.poll();
				check(index[0] + 1, index[1]);
				check(index[0] - 1, index[1]);
				check(index[0], index[1] + 1);
				check(index[0], index[1] - 1);
			}
			day++;
		}
	}
	
	public static void check(int i, int j) {
		boolean bi = i < 0 || i >= box.length;
		boolean bj = j < 0 || j >= box[0].length;
		if(bi || bj || box[i][j] == 1 || box[i][j] == -1) {
			return;
		} else {
			int[] index = {i, j};
			box[i][j] = 1;
			queue.offer(index);
			cnt_++;
			return;
		}
	}

}
