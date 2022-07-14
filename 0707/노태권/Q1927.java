import java.util.*;
public class Q1927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Minheap h = new Minheap(100001);
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if (x == 0) {
				System.out.println(h.delete());
			} else {
				h.insert(x);
			}
		}

	}



    private static class Minheap {
	
    	int heap[];
    	int size;
	
    	public Minheap(int size) {
    		heap = new int [size];
    	}
	
    	public void insert(int x) {
    		heap[++size] = x;
		
    		for (int i = size; i > 1; i /= 2) {
    			if (heap[i/2] > heap[i]) {
    				swap(i/2, i);
    			} else {
    				break;
    			}
    		}
    	}
	
    	public void swap(int a, int b) {
    		int temp = heap[a];
    		heap[a] = heap[b];
    		heap[b] = temp;
    	}
	
    	public int delete() {
    		if (size == 0) {
    			return 0;
    		}
		
    		int root = heap[1];
    		heap[1] = heap[size];
    		size--;
		
    		for (int i = 1; i * 2 <= size;) {
    			if (heap[i] < heap[i * 2] && heap[i] < heap[i * 2 + 1]) {
    				break;
    			} else if (heap[i * 2] < heap[i * 2 + 1]) {
    				swap(i, i * 2);
    				i = i * 2;
    			} else {
    				swap(i, i * 2 + 1);
    				i = i * 2 + 1;
    			}
    		}
    		return root;
		
    	}
    }
}
