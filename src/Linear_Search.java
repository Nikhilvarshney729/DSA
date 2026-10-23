import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = -1;
        for(int i = 0;i < n;i++){
            if(a[i] == key){
                ans = i;
                break;
            }
        }
        if(ans != -1){
            System.out.print("Element found at index: " + ans);

        }else{
            System.out.print("Element not found");
        }
    }

}
