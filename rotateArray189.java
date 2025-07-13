public class rotateArray189{
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        int rotated[] = new int[n];
        for(int i = 0; i < n; i++){
            rotated[(i + k) % n] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = rotated[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}