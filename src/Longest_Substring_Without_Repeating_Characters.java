import java.util.Scanner;
public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int ans = 0;
        int []index = new int[128];
        for(int j = 0,i = 0;j < n;j++){
            i = Math.max(index[s.charAt(j)],i);
            ans = Math.max(ans,j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        System.out.println(ans);
    }
}
