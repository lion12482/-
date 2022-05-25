import java.util.Scanner;
public class Q1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0; // 반복 횟수
		System.out.print("정수 입력(0 ~ 99)> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 입력 받은 수
		int copy = num; // 반복해서 같은 수가 나오면 종료 
		
		while(true) {
		num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
		
		count++;
		System.out.println(num);
		
		if (copy == num){
			break;
		}
		}
		System.out.print("반복횟수: " + count);
	}

}
