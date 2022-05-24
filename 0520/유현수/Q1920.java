package baekjoon;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N, M;
		int[] array;
//		ArrayList<Integer> list = new ArrayList<>();
		TreeSet<Integer> list = new TreeSet<>();
		
		// Time over
//		N = in.nextInt();
//		for(int i=0; i<N; i++) {
//			list.add(in.nextInt());
//		}
//		
//		M = in.nextInt();
//		for(int i=0; i<M; i++) {
//			if(list.contains(in.nextInt())) {
//				System.out.println(1);
//			} else {
//				System.out.println(0);
//			}
//		}
		
		N = in.nextInt();
		for(int i=0; i<N; i++) {
			list.add(in.nextInt());
		}
		
		M = in.nextInt();
		for(int i=0; i<M; i++) {
			if(list.contains(in.nextInt())) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			
		}		
	}
}
