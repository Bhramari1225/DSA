import java.util.Arrays;

public class containsDuplicate {
    public static boolean containsDuplicate(int nums[]){
        Arrays.sort(nums);
        for(int j = 1; j < nums.length; j++){
            if(nums[j] == nums[j-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
