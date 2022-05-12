import java.util.Scanner;
public class Q8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		String str;
		
		for (int i = 0; i < test; i++) {
			str = sc.next();
			int sum = 0, cnt = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				}
				else
					cnt = 0;
			}
			System.out.println(sum);
		}
		

	}

}
