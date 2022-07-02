import java.util.Scanner;
public class Q2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 정수 개수 받기
		
		int[] numbers = new int[n]; // 개수 만큼 배열 생성
		
		for (int i = 0; i < n; i++) { //정수 개수 만큼 반복
			numbers[i] = sc.nextInt();
		}
		
		sortArray(numbers);
		
		for (int s : numbers) {
			System.out.println(s);
		}
		
		
	}
	
	private static void sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
		
}


