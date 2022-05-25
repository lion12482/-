import java.util.Scanner;
public class Q108070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력 받은 수
		
		int[] fibonacci = new int[n + 1];
		
		for(int i = 0; i < fibonacci.length; i++ ) {
			if (i == 0) fibonacci[0] = 0;
			else if (i == 1) fibonacci[1] = 1;
			else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		System.out.println(fibonacci[n]);
	}
}

