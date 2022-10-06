package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1991 {
	static HashMap<Character, Integer> node_ = new HashMap<>();
	static HashMap<Integer, Character> node = new HashMap<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		node_.put('A', 1);
		
		for(int i=1; i<=num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			char nodeValue = st.nextToken().charAt(0);
			char rightValue = st.nextToken().charAt(0);
			char leftValue = st.nextToken().charAt(0); 
			int nodeNum = node_.get(nodeValue);
			
			if(rightValue != '.') {
				node_.put(rightValue, nodeNum*2);
			}
			
			if(leftValue != '.') {
				node_.put(leftValue, nodeNum*2+1);
			}
		}
		
		for(char c : node_.keySet()) {
			node.put(node_.get(c), c);
		}
		
		preOrder(1);
		System.out.println();
		inOrder(1);
		System.out.println();
		postOrder(1);
	}
	
	public static void preOrder(int index) {
		System.out.print(node.get(index));
		if(node.get(index * 2) != null) {
			preOrder(index * 2);
		}
		if(node.get(index * 2 + 1) != null) {
			preOrder(index * 2 + 1);
		}
	}
	
	public static void inOrder(int index) {
		if(node.get(index * 2) != null) {
			inOrder(index * 2);
		}
		System.out.print(node.get(index));
		if(node.get(index * 2 + 1) != null) {
			inOrder(index * 2 + 1);
		}
	}
	
	public static void postOrder(int index) {
		if(node.get(index * 2) != null) {
			postOrder(index * 2);
		}
		if(node.get(index * 2 + 1) != null) {
			postOrder(index * 2 + 1);
		}
		System.out.print(node.get(index));
	}
}
