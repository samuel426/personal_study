import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int score = 0;
		
		if((num1 == num2) && (num2 == num3)) {
			System.out.print(score);
		}
	}

}
