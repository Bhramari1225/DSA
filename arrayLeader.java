import java.util.ArrayList;
import java.util.Collections;

public class arrayLeader {
    public static void main(String[] args) {
        int arr[]=  {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));

    }

    public static ArrayList<Integer> leaders(int arr[]){
        int leader = 0;
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > leader){
                leader = arr[i];
                leaders.add(leader);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
