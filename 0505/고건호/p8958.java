package algo;

import java.util.*;

public class p8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String score;
		int sum = 0;
		
		for(int i = 0; i<num; i++) {
			int count = 0;
			sum = 0;
			score = scan.next();
			for(int k=0; k<score.length(); k++) {
				if(score.charAt(k)=='O') {
					count++;
					sum += count;
				}else if(score.charAt(k)=='X') {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
