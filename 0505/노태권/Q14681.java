import java.util.Scanner;
public class Q14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("x좌표 입력> ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("y좌표 입력> ");
		int y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.print("1사분면");
		}	
		else if (x < 0 && y > 0) {
			System.out.print("2사분면");
		}
		else if (x < 0 && y < 0) {
			System.out.print("3사문면");
		}
		else
			System.out.print("4사분면");
		
		
	}

}
