import java.util.Scanner;
public class Search_Insert_Position {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i = 0;i < n;i++){
            if(nums[i] >= target){
                System.out.println(i);
                return;
            }
        }
        System.out.println(nums.length);
    }
}