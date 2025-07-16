public class moveZeros {
    public static void moveZeros(int nums[]){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++; 
            }
        }
        for(int j = i; j < nums.length; j++){
            nums[j] = 0;
        }
    }
    public static void main(String[] args) {
        int []nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}
