import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = num - 1; j < num + i - 1; j++) {
                System.out.print("*");
            }
            for (int j = num - 1; j < num + i - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; num - i > j; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}