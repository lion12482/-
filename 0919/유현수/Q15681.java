package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q15681 {
	public static class Graph {
		private Node[] node;
		private int[] cnt;
		
		public Graph(int size) {
			this.node = new Node[size+1];
			this.cnt = new int[size+1];
			
			for(int i=1; i<=size; i++) {
				node[i] = new Node();
			}
		}
		
		public void addEdge(int node1, int node2) {
			node[node1].addChild(node2);
			node[node2].addChild(node1);
		}
		
		public int makeTree(int root) {
			int cnt = 1;
			ArrayList<Integer> children = node[root].getChildren();
			
			for(int i=0; i<children.size(); i++) {
				node[children.get(i)].removeChild(root);
				cnt += makeTree(children.get(i));
			}
			this.cnt[root] = cnt;
			
			return cnt;
		}
		
		public int getCount(int query) {
			return cnt[query];
		}
	}
	
	public static class Node {
		private ArrayList<Integer> children = new ArrayList<>();
		
		public void addChild(int child) {
			children.add(child);
		}
		
		public void removeChild(int child) {
			children.remove((Integer)child);
		}
		
		public ArrayList<Integer> getChildren() {
			return children;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken()),
				Q = Integer.parseInt(st.nextToken());
		Graph tree = new Graph(N);
		
		for(int i=0; i<N-1; i++) {
			st = new StringTokenizer(br.readLine());
			tree.addEdge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		tree.makeTree(R);
		
		for(int i=0; i<Q; i++) {
			System.out.println(tree.getCount(Integer.parseInt(br.readLine())));
		}
	}
}
