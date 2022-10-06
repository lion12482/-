package algo;

import java.util.*;
import java.io.*;

public class p1927 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> heap = new ArrayList<Integer>();
		heap.add(0);
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x==0) {
				if(heap.size()==1) {
					System.out.println("0");
				}else {
					System.out.println(heap.get(1));
					int a = heap.size()-1;
					heap.set(1, heap.get(a));
					heap.remove(a);
					int root = 1;
					while((root*2)<heap.size()) {
						int min = heap.get(root*2);
						int minpos = root*2;
						
						if(((root*2+1)<heap.size())&&min>heap.get(root*2+1)) {
							min = heap.get(root*2+1);
							minpos = root*2+1;
						}
						if(heap.get(root)>min)
							break;
						
						int tmp = heap.get(root);
						heap.set(root, heap.get(minpos));
						heap.set(minpos, tmp);
						root = minpos;
						
					}
				}
			}else {
				heap.add(x);
				int a = heap.size()-1;
				while(a>1&&heap.get(a)<heap.get(a/2)) {
					int tmp = heap.get(a/2);
					heap.set(a/2, heap.get(a));
					heap.set(a, tmp);
					a=a/2;
				}
			}
		}
	}
}
