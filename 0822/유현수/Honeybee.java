package nypc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Honeybee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		int[] honey = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			honey[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(findMaxHoney(findHoneycomb(honey, K)));
	}
	
	public static int[] findHoneycomb(int[] honey, int K) {
		for(int i=0; i<K; i++) {
			int preLoss = 0;
			int preIndex = 0;
			int lossTot = 0;
			int beeNum = 0;
			
			if(i == 0) {
				honey[honey.length-1] = 0;
				continue;
			}
			for(int j=honey.length-1; j>=0; j--) {
				if(honey[j] == 0) {
					beeNum++;
					continue;
				}
				if(preLoss == 0) {
					lossTot = honey[j] * (beeNum + 1);
					preLoss += honey[j];
					preIndex = j;
					continue;
				}
				if(lossTot > preLoss + honey[j] * (beeNum + 1)) {
					lossTot = preLoss + honey[j] * (beeNum + 1);
					preLoss += honey[j];
					preIndex = j;
					continue;
				} else {
					break;
				}
			}
			honey[preIndex] = 0;

		}
		
		return honey;
	}

	public static int findMaxHoney(int[] honey) {
		int max = 0;
		int beeNum = 0;
		
		for(int i=honey.length-1; i>=0; i--) {
			if(honey[i] == 0) {
				beeNum++;
				continue;
			}
			max += honey[i] * beeNum;
		}
		
		return max;
	}
}
