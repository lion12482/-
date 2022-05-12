import java.util.Scanner;
public class Q1002 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x1, y1, r1, x2, y2, r2;
        int T;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int result;

        x1 = sc.nextInt();
        y1 = sc.nextInt();
        r1 = sc.nextInt();

        x2 = sc.nextInt();
        y2 = sc.nextInt();
        r2 = sc.nextInt();


        // 두 점사이 거리
        int d = (int)(Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y1 - y2), 2)));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            result = -1;
        }
        else if ()




        //test

    }

}