import java.util.*;

public class Union_ISection {
    public static void main(String[] args) {
        // Union
        int arr1 [] = {7,3,9};
        int arr2[] = {9,6,3,9,2,9,4};
         int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println(hs);
        System.out.println("Union : "+hs.size());

        // Intersection 
        hs.clear();

        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                System.out.print(arr2[i] +" ");
               
                count++;
                hs.remove(arr2[i]);
               
            }
        }
        System.out.println("InterSection : "+count);
    }
}
