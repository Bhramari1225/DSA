import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int nums[], int target){
        int pair[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            if(map.get(result) != null){
                pair[0] = map.get(result);
                pair[1] = i;
                return pair;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return null;
        
    }
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int []result = twoSum(nums, target);
        if(result != null){
            System.out.println(result[0]+","+result[1]);
        }
        else{
            System.out.println("no pair");
        }
        
    }
}
