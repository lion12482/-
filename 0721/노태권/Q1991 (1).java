import java.util.*;
import org.w3c.dom.Node;
import java.io.*;

public class Q1991 {
	static class Node {
		char data;
		Node left;
		Node right;
		
		Node(char data) {
			this.data = data;
		}
	}
	
	static class Tree {
		Node root;
		
		public void createNode(char data, char leftData, char rightData) {
			if (root == null) {
				root = new Node(data);
				if (leftData != '.') {
					root.left = new Node(leftData);
				}
				if (rightData != '.') {
					root.right = new Node(rightData);
				}
			} else {
				searchNode(root, data, leftData, rightData);
			}
		}

		public void searchNode(Node root, char data, char leftData, char rightData) {
			if (root == null) {
				return;
			} else if (root.data == data) {
				if (leftData != '.') {
					root.left = new Node(leftData);
				}
				if (rightData != '.') {
					root.right = new Node(rightData);
				}
			} else {
				searchNode(root.left, data, leftData, rightData);
				searchNode(root.right, data, leftData, rightData);
			}
		}
		
		public void preorder(Node root) {
			System.out.print(root.data);
			if (root.left != null) preorder(root.left);
			if (root.right != null) preorder(root.right);
		}
		
		public void inorder(Node root) {
			if(root.left != null) inorder(root.left);
			System.out.print(root.data);
			if (root.right != null) preorder(root.right);
		}
		public void postorder(Node root) {
			if (root.left != null) postorder(root.left);
			if (root.right != null) postorder(root.right);
			System.out.print(root.data);
		}
		
	}
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Tree tree = new Tree();
		
		for (int i = 0; i < n; i++) {
			char[] data;
			data = br.readLine().replaceAll(" ", "").toCharArray();
			tree.createNode(data[0], data[1], data[2]);
		}
		
		tree.preorder(tree.root);
		System.out.println();
		
		tree.inorder(tree.root);
		System.out.println();
		
		tree.postorder(tree.root);
		
		
		

	}

}
