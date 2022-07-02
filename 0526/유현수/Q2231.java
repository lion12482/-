package baekjoon;

import java.util.Scanner;

public class Q2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int min = min(num);

		for(int i=min; i<num; i++) {
			if(i + sumDigits(i) == num) {
				System.out.println(i);
				break;
			} else if(i == num-1){
				System.out.println(0);
				break;
			}
		}
	}
	
	public static int min(int num) {
		String s = String.valueOf(num);
		int a = (int) Math.pow(10, s.length()-1);
		int minus = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(i == 0) {
				minus += num / a;
			} else {
				minus += 9;
			}
		}
		
		return num - minus;
	}
	
	public static int sumDigits(int num) {
		String s = String.valueOf(num);
		int a = (int) Math.pow(10, s.length()-1);
		int out = 0;
		
		for(int i=0; i<s.length(); i++) {
			out += num / a;
			num -= (num / a) * a;
			a /= 10;
		}
		
		return out;
	}

}
