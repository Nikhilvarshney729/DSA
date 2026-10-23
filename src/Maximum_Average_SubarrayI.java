import java.util.Scanner;
public class Maximum_Average_SubarrayI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        double sum =0;
        for(int i = 0;i<k;i++){
            sum += a[i];
        }
        double max = sum;
        for(int i = k;i < n;i++){
            sum += a[i] - a[i-k];
            max = Math.max(max,sum);
        }
        System.out.println(max/k);
    }
}
