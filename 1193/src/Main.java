import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		int sum = 0;
		int n = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input_n = Integer.parseInt(br.readLine());
		
		if(input_n == 1) {
			System.out.println("1/1");
			return;
		}
		
		while(sum < input_n) {
			n++;
			sum += n;
		}
		
		int prevSum = sum - n;
		int offset = input_n - prevSum;

		int numerator, denominator;
		
		if(n % 2 == 0) {
			numerator = offset;
			denominator = n - offset + 1;
		} else {
			numerator = n - offset + 1;
			denominator = offset;
		}
		
		System.out.println(numerator + "/" + denominator);
	}

}
