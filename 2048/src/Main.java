import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int score = 0;
        int max = num1;

        if((num1 == num2) && (num2 == num3)) {
            score += 10000 + num1*1000;
            System.out.print(score);
            return;
        } else if(num1 == num2) {
            score += 1000 + num2*100;
            System.out.print(score);
            return;
        } else if(num1 == num3){
            score += 1000 + num3*100;
            System.out.print(score);
            return;
        } else if(num2 == num3) {
            score += 1000 + num3*100;
            System.out.print(score);
            return;
        } else {
            if(num2 > max) {
                max = num2;
            }
            if(num3 > max) {
                max = num3;
            }
            score += max*100;
            System.out.print(score);
        }
    }

}
