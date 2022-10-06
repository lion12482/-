package algo;

import java.util.*;

public class p1967 {
	public static class Node{
		int node;
		int len;
		
		public Node(int node, int len) {
			this.len = len;
			this.node = node;
		}
	}
	
	public static int n;
	public static boolean[] visit;
	public static List<Node> list[];
	
	public static int realNode;
	public static int max;
	
	public static void Dfs(int x, int len) {
		if(len>max) {
			max = len;
			realNode = x;
		}
		
		visit[x] = true;
		for(Node nodes : list[x]) {
			if(!visit[nodes.node]) {
				visit[nodes.node] = true;
				Dfs(nodes.node, len + nodes.len);
			}
		}
	}
	
	public static void main(String[] args	) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		list = new ArrayList[n+1];
		for(int i = 0; i<n+1; i++) {
			list[i] = new ArrayList<Node>();
		}
		for(int i=0; i<n-1; i++) {
			int num = scan.nextInt();
			int node = scan.nextInt();
			int len = scan.nextInt();
			list[num].add(new Node(node,len));
			list[node].add(new Node(num,len));
		}
		visit = new boolean[n+1];
		Dfs(1,0);
		visit = new boolean[n+1];
		Dfs(realNode,0);
		
		System.out.println(max);
	}
}
