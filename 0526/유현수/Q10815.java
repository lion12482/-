package baekjoon;

import java.io.*;
import java.util.TreeSet;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int N, M;
        N = Integer.parseInt(in.readLine());
        TreeSet<Integer> card = new TreeSet<>();
        Object[] cardArr;
        int cnt = 0;

        for(String s : in.readLine().split(" ")) {
            card.add(Integer.parseInt(s));
        }
        
        cardArr = card.toArray();
        
        M = Integer.parseInt(in.readLine());
        for (String s : in.readLine().split(" ")) {
        	if(binarySearch(cardArr, Integer.parseInt(s), 0, N-1)) {
        		out.write('1');
        	} else {
        		out.write('0');
        	}
        	if(cnt != M-1) {
                out.write(' ');
        	}
        	cnt++;
        }
        in.close();
        out.close();
    }

    public static boolean binarySearch(Object[] card, int num, int start, int end) {
        if(start > end) {
            return false;
        }
        int middle = (start + end) / 2;

        if((int)card[middle] == num) {
            return true;
        } else if((int)card[middle] < num) {
            return binarySearch(card, num, middle + 1, end);
        } else {
            return binarySearch(card, num, start, middle - 1);
        }
    }
}
