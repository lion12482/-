package algo;

import java.util.*;

public class p2292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int te=1;
		int min=2;
		
		if(num==1) {
			System.out.println("1");
		}else {
			while(min<=num) {
				min = min+(6*te);
				te++;
			}
			System.out.println(te);
		}
	}
}