package algo;

import java.util.*;
import java.io.*;

public class p1753 {
		static class fin implements Comparable<fin>{
			int v, tolength;
			
			public fin(int v, int length) {
				this.v = v;
				this.tolength = length;
			}
			
			public int compareTo(fin o) {
				return Integer.compare(this.tolength, o.tolength);
			}
		}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine())-1;
		final int INF = Integer.MAX_VALUE;
		
		List<fin>[] nei = new ArrayList[V];
		for(int i = 0; i<V; i++) {
			nei[i] = new ArrayList<>();
		}
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			nei[Integer.parseInt(st.nextToken())-1].add(new fin(Integer.parseInt(st.nextToken())-1,
					Integer.parseInt(st.nextToken())));
		}
		int[] dist = new int[V];
		boolean[] checked = new boolean[V];
		
		Arrays.fill(dist, INF);
		dist[K] = 0;
		
		PriorityQueue<fin> pri = new PriorityQueue<>();
//		pri.add(new fin(K, dist[K]));
		fin cur = null;
		
		while(!pri.isEmpty()) {
			cur = pri.poll();
			if(checked[cur.v]) continue;
			
			for(fin next : nei[cur.v]) {
				if(!checked[next.v]&&dist[next.v]>cur.tolength + next.tolength) {
					dist[next.v] = cur.tolength+next.tolength;
					pri.add(new fin(next.v, dist[next.v]));
				}
			}
			checked[cur.v] = true;
		}
		
		for(int i =0; i<V; i++) {
			if(dist[i] == INF) {
				System.out.println("INF");
			}else {
				System.out.println(dist[i]);
			}
		}
	}
}