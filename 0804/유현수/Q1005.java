package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1005 {
	public static Integer[] time;
	public static class Structure {
		private int time;
		private ArrayList<Integer> preStr = new ArrayList<>();
		
		public Structure(int time) {
			this.time = time;
		}
		
		public void addPre(int pre) {
			this.preStr.add(pre);
		}
		
		public int getTime() {
			return time;
		}
		
		public ArrayList<Integer> getPreStr() {
			return preStr;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			final int N = Integer.parseInt(st.nextToken());
			final int K = Integer.parseInt(st.nextToken());
			Structure[] str = new Structure[N+1]; 
			time = new Integer[N+1];
			
			st = new StringTokenizer(br.readLine());
			for(int n=1; n<=N; n++) {
				str[n] = new Structure(Integer.parseInt(st.nextToken()));
			}
			
			for(int k=1; k<=K; k++) {
				st = new StringTokenizer(br.readLine());
				int now = Integer.parseInt(st.nextToken());
				int next = Integer.parseInt(st.nextToken());
				
				str[next].addPre(now);
			}
			
			System.out.println(findTime(str, Integer.parseInt(br.readLine())));
		}
	}
	
	public static int findTime(Structure[] str, int arrive) {
		ArrayList<Integer> preStr = str[arrive].getPreStr();
		int longest = 0;
		
		if(time[arrive] == null) {
			for(int i=0; i<preStr.size(); i++) {
				int time = findTime(str, preStr.get(i));
				longest = longest > time ? longest : time;
			}
			time[arrive] = str[arrive].getTime() + longest;
		}
		
		return time[arrive];
	}
}
