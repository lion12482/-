package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String> word = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String input = in.next();
			boolean isChanged = false;
			int size = word.size();

			if (i == 0 || word.get(size - 1).length() < input.length()) {
				word.add(input);
			} else if (word.contains(input)) {
				continue;
			} else {
				outer: for (int j = 0; j < size; j++) {
					if (word.get(j).length() == input.length()) { // Same Length?
						for (int a = 0; a < input.length(); a++) {
							if (word.get(j).charAt(a) > input.charAt(a)) {
								word.add(j, input);
								isChanged = true;
								break outer;
							} else if (word.get(j).charAt(a) < input.charAt(a)) {
								break;
							}
						}
					}

					if (word.get(j).length() > input.length()) {
						word.add(j, input);
						isChanged = true;
						break;
					}
				}

				if (!isChanged) {
					word.add(input);
				}
			}
		}
		
		for (String output : word) {
			System.out.println(output);
		}
	}
}