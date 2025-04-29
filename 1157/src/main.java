import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str.toUpperCase();
		char[] ustr = new char[str.length()]; 
		int[] score = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			if(ustr[i] == ' ') {
				ustr[i] = str.charAt(i);
				score[i] += 1;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if(ustr[i] == ustr[j]) {
					
				}
			}
		}
		int[] max_a = new int[str.length()];
		max_a[0] = 0;
		for (int i = 0; i < str.length(); i++) {
			
		}
		
	}
}
