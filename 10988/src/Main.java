import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int r = 1;
        for (int i = 0; i < s.length()/2; i++){
            if ((s.charAt(i) != s.charAt(s.length()-i-1))){
                r = 0;
                break;
            }
        }
        System.out.println(r);
    }
}