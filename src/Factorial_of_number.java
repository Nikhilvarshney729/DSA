import java.util.Scanner;
class Factorial_of_number{
    static int fact(int n){
        if(n==1) return 1;
        return n * fact(n -1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
        //Exam/DSA ke liye:
        //int → 12! tak
        //long → 20! tak
        //BigInteger → bahut bade factorial ke liye.
    }
}