import java.util.Scanner;
public class Q14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("x��ǥ �Է�> ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("y��ǥ �Է�> ");
		int y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.print("1��и�");
		}	
		else if (x < 0 && y > 0) {
			System.out.print("2��и�");
		}
		else if (x < 0 && y < 0) {
			System.out.print("3�繮��");
		}
		else
			System.out.print("4��и�");
		
		
	}

}
