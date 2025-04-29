import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 3;

        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt(); // 입력받은 숫자 배열에 저장
        }
        nums[1] += nums[2];
        if(nums[1] >= 60){
            nums[0] += nums[1]/60;
            if(nums[0] >= 24){
                nums[0] = nums[0]%24;
            }
            nums[1] = nums[1]%60;
        }

        System.out.print(nums[0] + " " + nums[1]);
    }

}