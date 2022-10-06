package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GoL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GameOfLife gol = new GameOfLife();
	}
	
	public static class GameOfLife {
		private Scanner in = new Scanner(System.in);
		private char[][] space;
		private ArrayList<Integer> survivor = new ArrayList<>();
		private int[][] survivorNum;
		
		public GameOfLife() throws InterruptedException {
			int width;
			int height;
			System.out.print("Width : ");
			width = in.nextInt();
			System.out.print("Height : ");
			height = in.nextInt();
			
			createSpace(width, height);
			print();
			while(true) {
				System.out.println();
				System.out.println("B = Birth, D = Death, R = Random, N = Next, S = Start, 0 = Terminate");
				System.out.print("Input : ");
				String input = in.next();
				
				if(input.equals("B") || input.equals("D")) {
					System.out.print("x = ");
					int x = in.nextInt();
					System.out.print("y = ");
					int y = in.nextInt();
					
					if(isOutOfBounds(x, y)) {
						System.out.println("Out of bounds");
					} else {
						switch(input) {
						case "B":	birth(x, y);	print();	break;
						case "D":	death(x, y);	print();	break;
						}
					}
				} else if(input.equals("R")) {
					System.out.print("Probability(1 = 100%, 2 = 50%, 4 = 25%) : ");
					random(in.nextInt());
					print();
				} else if(input.equals("N")) {
					next();
				} else if(input.equals("S")) {
					System.out.print("Speed(1sec = 1000) : ");
					start(in.nextInt());
				} else if(input.equals("0")) {
					System.out.println("Terminated");
					break;
				} else {
					System.out.println("Invalid Input");
				}
			}
		}
		
		public void start(int m) throws InterruptedException {
			int cnt = 0;
			ArrayList<String> save = new ArrayList<>();
			
			main:while(true) {
				if(survivor.isEmpty()) {
					System.out.println("Result : Dead(Turn " + cnt + ")");
					break;
				}
				
				save.add(spaceToString());
				if(save.size() > 10) {
					save.remove(0);
				}
				if(save.size() > 1) { 
					for(int i=0; i<save.size()-1; i++) {
						if(save.get(save.size()-1).equals(save.get(i))) {
							System.out.println("Result : Repetition(Turn " + (cnt - save.size() + i + 1) + " ~ Turn " + cnt + ")");
							break main;
						}
					}
				}
				
				cnt++;
				System.out.println("Turn " + cnt);
				next();
				Thread.sleep(m);
			}
			
		}
		
		public void next() {
			for(int i=0; i<survivorNum.length; i++) {
				Arrays.fill(survivorNum[i], 0);
			}
			
			for(int i=0; i<survivor.size(); i++) {
				int x = survivor.get(i) % space[0].length;
				int y = survivor.get(i) / space[0].length;
				
				if(x > 0) {
					survivorNum[y][x-1]++;
					if(y > 0) 					survivorNum[y-1][x-1]++;
					if(y < space.length - 1)	survivorNum[y+1][x-1]++;
				}
				
				if(x < space[0].length - 1) {
					survivorNum[y][x+1]++;
					if(y > 0) 					survivorNum[y-1][x+1]++;
					if(y < space.length - 1) 	survivorNum[y+1][x+1]++;
				}
				if(y > 0) 					survivorNum[y-1][x]++;
				if(y < space.length - 1) 	survivorNum[y+1][x]++;
			}
			
			for(int y=0; y<space.length; y++) {
				for(int x=0; x<space[0].length; x++) {
					if(survivorNum[y][x] == 3) {
						birth(x, y);
						continue;
					}
					if(survivorNum[y][x] > 3 || survivorNum[y][x] < 2) {
						death(x, y);
						continue;
					}
				}
			}
			
			print();
		}
		
		public String spaceToString() {
			String s = "";
			for(int i=0; i<space.length; i++) {
				s += String.valueOf(space[i]);
			}
			return s;
		}
		
		public void createSpace(int width, int height) {
			space = new char[height][width];
			survivorNum = new int[height][width];
			for(int i=0; i<space.length; i++) {
				Arrays.fill(space[i], ' ');
			}
		}
		
		public void print() {
			for(int y=0; y<=space.length; y++) {
				for(int x=0; x<=space[0].length; x++) {
					if(y == space.length) {
						if(x == space[0].length) {
							System.out.print("/");
							break;
						}
						System.out.print("- ");
					} else if(x == space[0].length) {
						System.out.print("| ");
					} else {
						System.out.print(space[y][x] + " ");
					}
				}
				System.out.println();
			}
		}
		
		public void birth(int x, int y) {
			if(space[y][x] == ' ') {
				space[y][x] = '+';
				survivor.add(y * space[0].length + x);
			}
		}
		
		public void death(int x, int y) {
			if(space[y][x] == '+') {
				space[y][x] = ' ';
				survivor.remove((Integer)(y * space[0].length + x));
			}
		}
		
		public void random(int r) {
			for(int y=0; y<space.length; y++) {
				for(int x=0; x<space[0].length; x++) {
					int random = (int)(Math.random() * r);
					switch(random) {
					case 0:	birth(x, y);	break;
					default:	death(x, y);
					}
				}
			}
		}
		
		public boolean isOutOfBounds(int x, int y) {
			return x >= space[0].length || y >= space.length
					|| x < 0 || y < 0;
		}
	}
}
