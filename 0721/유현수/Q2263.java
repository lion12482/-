package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2263 {
	static int outNum = 0;
	static int[] inOrder;
	static int[] postOrder;
	static int[] inOrderIndex;
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());
		inOrder = new int[n + 1];
		postOrder = new int[n + 1];
		inOrderIndex = new int[n + 1];

		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			inOrder[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(bf.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			postOrder[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= n; i++) {
			inOrderIndex[inOrder[i]] = i;
		}

		output(1, n, 1, n);
	}

	public static void output(int inStart, int inEnd, int postStart, int postEnd) {
		if (inStart > inEnd || postStart > postEnd) {
			return;
		}
		int root = postOrder[postEnd];
		System.out.print(root + " ");

		int rootIndex = inOrderIndex[root];
		int left = rootIndex - inStart;

		output(inStart, rootIndex - 1, postStart, postStart + left - 1);
		output(rootIndex + 1, inEnd, postStart + left, postEnd - 1);
	}
}
