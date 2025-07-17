import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int total = 0;
		
		while(num != 0) {
			total += num;
			num--;
		}
		System.out.print(total);
	}
}
