import java.util.Scanner;
public class Recursion_Practice {
   static double power(double a,long n){
       if(n==0){
           return 1;
       }
       else if(n<0){
           return 1/power(a, -n);
       }else{
           return a * power(a, n-1);
       }
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       long n = sc.nextLong();
       System.out.println(power(a, n));
   }
}
