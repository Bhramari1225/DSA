class reverseAnArray{
    
    public static void reverseArray(int []arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < n / 2){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4};
        reverseArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}