package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Data implements Comparable<Data> {
	int num, value;
	
	public Data(int num, int value) {
		this.num = num;
		this.value = value;
	}

	@Override
	public int compareTo(Data data) {
		// TODO Auto-generated method stub
		return this.value - data.value;
	}

	
}

public class Q1753 {		// ¿À´ä
	static ArrayList<ArrayList<Data>> link = new ArrayList<>();
	static int[] shortest;
	static PriorityQueue<Data> PQ = new PriorityQueue<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int V = Integer.parseInt(st.nextToken()), E = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		shortest = new int[V+1];
		
		for(int i=0; i<=V; i++) {
			link.add(new ArrayList<>());
		}
		
		for(int i=1; i<=E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()), 
					w = Integer.parseInt(st.nextToken());
			if(v == K) {
				continue;
			}
			link.get(u).add(new Data(v, w));
		}
		
		PQ.add(new Data(K, 0));
		Arrays.fill(shortest, Integer.MAX_VALUE);
		shortest[K] = 0;
		dijkstra();
		
		for(int i=1; i<=V; i++) {
			if(shortest[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(shortest[i]);
			}
		}
		
		br.close();
	}
	
	public static void dijkstra() {
		while(!PQ.isEmpty()) {
			Data data = PQ.poll();
			int start = data.num;
			
			if (data.value > shortest[start]) continue;
			
			while(!link.get(start).isEmpty()) {
				int num = link.get(start).get(0).num;
				int value = link.get(start).get(0).value;
				
				if(shortest[num] < value + shortest[start]) {
					link.get(start).remove(0);
					continue;
				}
				shortest[num] = value + shortest[start];
				
				PQ.add(link.get(start).get(0));
				link.get(start).remove(0);
			}

		}
	}

}
