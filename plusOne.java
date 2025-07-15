public class plusOne {
    public static int[] plusOne(int arr[]){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] + 1 != 10){
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }
        int []newArr = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arr1[] = {9, 9};
        arr1 = plusOne(arr1);
        for(int i : arr1){
            System.out.print(i + " ");
        }
    }
}
