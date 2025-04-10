import java.util.*;

public class CountDist {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        //int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){   // O(n)
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
       }
    }

