import java.util.Scanner;
public class Container_With_Most_Water {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []h = new int[n];
        for(int i = 0;i < n;i++){
            h[i] = sc.nextInt();
        }
        int maxArea = 0;
        int l = 0;
        int r = n-1;
        while(l < r){
            int area = Math.min(h[l],h[r]) * (r-l);
            maxArea = Math.max(maxArea,area);
            if(h[l] < h[r]){
                l++;
            }else{
                r--;
            }
        }
        System.out.println(maxArea);
    }
}
