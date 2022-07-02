import java.util.*;
public class Q1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0; // 소수 개수
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) { // n만큼 num 받기
			arr[i] = sc.nextInt();
		
			boolean flg = true;
			
		    if (arr[i] == 1) {
			    continue;
		    }
	
			for(int x = 2; x < arr[i]; x++) {
			    if (arr[i] % x == 0) {
				    flg = false;
				    break;
				}
			}
		    if(flg) {
			    count ++;
            } 
		 }
		
		System.out.println(count);
	
	}

}
