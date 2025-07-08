import java.io.*;



public class Main {

	public static void main(String[] args) throws Exception {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = Integer.parseInt(br.readLine());
		int var1 = Integer.parseInt(br.readLine());

		int[][] arr1 = new int[var1][2];
		for(int i = 0; i < var1; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < 2; j++) {
				arr1[i][j] = Integer.parseInt(str[j]);
			}
		}
		int total = 0;
		for(int i = 0; i < var1; i++) {
			total += arr1[i][0] * arr1[i][1];
		}
		
		if(total == money) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
