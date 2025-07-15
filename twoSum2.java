import java.util.HashMap;

public class twoSum2 {
    public static int[] twoSum2(int nums[], int target){
        int pair[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            if(map.get(result) != null){
                pair[0] = map.get(result) + 1;
                pair[1] = i + 1;
                return pair;
            }
            else{
                map.put(nums[i], i);
            } 
        } 
        return null;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = twoSum2(numbers, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}
