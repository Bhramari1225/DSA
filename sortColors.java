public class sortColors {
    public static void sortColors(int nums[]){
        int n = nums.length;
        int zeros = 0, ones = 0;
        for(int num : nums){
            if(num == 0){
                zeros++;
            }
            if(num == 1){
                ones++;
            }
        }
        for(int i = 0; i < zeros; i++){
            nums[i] = 0;
        }
        for(int i = zeros; i < zeros + ones; i++){
            nums[i] = 1;
        }
        for(int i = zeros + ones; i < n; i++){
            nums[i] = 2;
        }
    }
    public static void main(String[] args) {
        int []nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
