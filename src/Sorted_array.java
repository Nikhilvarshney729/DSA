class Sorted_array {
    static boolean isSorted(int arr[], int n){
        if(n==0 || n==1){
            return true;
        }
        if(arr[n-1] < arr[n-2]){
            return false;
        }
        return isSorted(arr, n-1);
    }
        public static void main(String[] args){
        int arr[] = {1, 2, 8, 3};
        int n = arr.length;
        if(isSorted(arr, n)){
                System.out.print("True");
        }
        else{
                System.out.print("False");
        }
    }
}
