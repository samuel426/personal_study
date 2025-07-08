import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int case_num = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		int[] arr1 = new int[case_num];
		
		while((case_num--) != 0) {
			sum += sc.nextInt();
			sum += sc.nextInt();
			arr1[i] = sum;
			sum = 0;
			i++;
		}
		
		case_num = i;
		
		for (i = 0; i < case_num; i++) {
			System.out.println(arr1[i]);
		}
	}

}
