import java.util.Scanner;

public class javaControl{
	
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a+b);
	}
}