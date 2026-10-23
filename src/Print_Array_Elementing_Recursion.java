import java.util.Scanner;
public class Print_Array_Elementing_Recursion {
    static void printArray(int arr[], int n){
        if(n==0){
            return;
        }
        printArray(arr, n-1);
        System.out.print(arr[n-1] + " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements of the array are: ");
        printArray(arr, n);
    }
}
