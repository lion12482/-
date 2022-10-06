package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1967 {
	public static class Node {
		ArrayList<Integer> child = new ArrayList<>();
		int value;
		int childNum = 0;
		
		public void addChild(int child) {
			this.child.add(child);
			childNum++;
		}
		
		public void addValue(int value) {
			this.value = value;
		}
	}
	
    static int diameter = -1;
    static Node[] node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        node = new Node[num+1];
        
        for(int i=1; i<=num; i++) {
        	node[i] = new Node();
        }
        
        for(int i=0; i<num-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            node[parent].addChild(child);
            node[child].addValue(value);
        }

        findDiameter(1);

        if(num > 1) {
            System.out.println(diameter);
        } else {
            System.out.println(0);
        }

    }
    
    public static int findDiameter(int parent) {
    	if(node[parent].child.isEmpty()) {
    		return node[parent].value;
    	}
    	int value = 0;
    	
    	for(int i=0; i<node[parent].childNum; i++) {
        	int value_ = findDiameter(node[parent].child.get(i));

        	diameter = diameter > value + value_ ? diameter : value + value_;
        	value = value > value_ ? value : value_;	
    	}
    	
		return value + node[parent].value;    	
    }
}
