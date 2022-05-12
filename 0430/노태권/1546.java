import java.util.Scanner;
public class MindAverage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 0;
        int sum = 0;
        int max = 0;
        int score = 0;
        Scanner sc = new Scanner(System.in); // 과목 수 받기
        x = sc.nextInt();

        for (int i=0; i < x; i++) {
            score = sc.nextInt();

            if (score > max) {
                max = score;
            }
            sum += score;

        }
        double avg = (double)sum / (double)max * 100 / x;
        System.out.print("평균: " + avg);

    }

}