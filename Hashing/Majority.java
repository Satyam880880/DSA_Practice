
import java.util.*;
public class Majority {
 
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
       
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet) {
            if (map.get(key) > nums.length / 2) {
                System.out.println("Majority element is: " + key);
                
            }
        }
    }
}

/* 
   public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
       
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
        for(Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                System.out.println("Majority element is: " + key);
                
            }
        }
    }
}

 */
