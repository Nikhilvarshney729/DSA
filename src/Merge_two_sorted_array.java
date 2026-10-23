public class Merge_two_sorted_array {
    static void merge(int[] arr1,int[] arr2,int n,int m){
        int i = 0,j = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else{
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while(i < n){
            System.out.print(arr1[i] + " ");
            i++;
        }while(j < m){
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
    public static void main(String[] agrs){
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6};
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n , m);
    }
}
