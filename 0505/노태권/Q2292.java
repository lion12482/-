import java.util.Scanner;
public class Q2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int room = sc.nextInt();
		int num = 1, cnt = 1;
		
		
		if (room == 1) {
			System.out.print("1");
		}
		else { 
			while(num < room) {
				num += 6 * cnt;
				cnt ++;
		}
			
		}
		System.out.println(cnt);
		
		

	}

}
