package wda;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, sum;
		while(true){
			sum = 0;
			N=scan.nextInt();
			if(N==0)
				break;
			if(N<10) {
				System.out.println(N);
			}else {
				while(N>0) {
					sum += N%10;
					N = N/10;
				}
				if(sum<10) {
					System.out.println(sum);
				}else {
					System.out.println(sum%10+sum/10);
				}
			}
		}
	}
}
