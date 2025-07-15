public class singleNumber {
    public static int singleNumbers(int[] nums){
        int s = 0;
        for(int i : nums){
            s ^= i;
        }
        return s;
    }
    public static void main(String[] args) {
        int []nums = {2, 2, 1};
        System.out.println(singleNumbers(nums));
    }
}
