class Maximum_element_of_an_array {
    static int maxElement(int arr[], int n){
        if(n==0){
            return Integer.MIN_VALUE;
        }
        return Math.max(arr[n-1], maxElement(arr, n-1));
    }
    public static void main(String[] args){
        int []arr = {1,8,12,18,3};
        int n = arr.length;
        System.out.println(maxElement(arr, n));
    }
}
