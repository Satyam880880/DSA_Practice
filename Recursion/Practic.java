/* 
public class Practic {
    public static void printNumber(int n){
        if(n ==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
        System.out.println("After recursive call: " + n);
          System.out.println(n);
    }
    public static void main(String[] args) {
        printNumber(5);
    } 
}
     Reverse  String
public class Practic {
    public static void reverse(String str , int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str ,idx-1);
       // System.out.println(str.charAt(idx));
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverse(str, str.length()-1);
    }
}
    
    // 1st & last occurance
public class Practic {
    public static int  first = -1;
         public static int  last = -1;
    public static void occurance(String str , int idx, char el){
        
        if(idx == str.length()){
           System.out.println(first);
           System.out.println(last);
           return;
        }
        char charCurr = str.charAt(idx);
        if(charCurr == el){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        occurance(str, idx+1, el);
    }
 public static void main(String[] args) {
    String str = "abaacdaefaah";
    char el = 'a';
    occurance(str, 0, el);
 }
}

// array is sorted (strictly increasing)
public class Practic {
    public static boolean issorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        /* 
        if(arr[idx] < arr[idx + 1]){
            return issorted(arr, idx+1);
        }else{
            return false;
        }
        // END
        // reverse logic
        if(arr[idx] >= arr[idx + 1]){
            return false;  // unsorted
        }else{
            return issorted(arr, idx+1);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5};
        System.out.println(issorted(arr, 0)); // Output: true
    }
    }

 // Move all x to end of string
public class Practic {
    public static void move(String str , int idx , int count , String newstr){   
       if(idx == str.length()){
        for(int i=0;i<count;i++){
            newstr += 'x';
        }
        System.out.println(newstr);
        return;
       }
         char curr = str.charAt(idx);
         if(curr == 'x'){
            count++;
            move(str, idx+1, count, newstr);
         }else{
            newstr += curr;
            move(str, idx+1, count, newstr);
         }
    }
    public static void main(String[] args) {
        String str = "axbxcxd";
        move(str, 0, 0, "");
    }
}
    
// Remove duplicates from string
public class Practic {
   public static boolean map[] = new boolean[26];
   public static void remove(String str , int idx , String newstr){
    if(idx == str.length()){
        System.out.println(newstr);
        return;
    }
    char curr = str.charAt(idx);
    if(map[curr - 'a'] == true){
        remove(str, idx+1, newstr);
    }else{
        newstr += curr;
        map[curr - 'a'] = true; // mark as visited
        remove(str, idx+1, newstr);
    }
   }
    
    public static void main(String[] args) {
        String str = "abbcdeffgh";
        remove(str, 0, "");
    }
}

// All  subsquences
public class Practic {
   public static void subseq(String str, int idx, String newString) {
        // Base case: reached end of string
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // 1. Include the current character
        subseq(str, idx + 1, newString + currChar);
        // 2. Exclude the current character
        subseq(str, idx + 1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subseq(str, 0, "");
    }
}
*/
// Unique subsequences
import java.util.*;
public class Practic {
   public static void subseq(String str, int idx, String newString , HashSet<String> set) {
        // Base case: reached end of string
        if (idx == str.length()) {
            if(set.contains(newString)) {
                return; // Skip if this subsequence is already present
            }else{
                set.add(newString); // Add the new subsequence to the set
                 System.out.println(newString);
                  return;
            }
        }
        char currChar = str.charAt(idx);
        // 1. Include the current character
        subseq(str, idx + 1, newString + currChar, set);
        // 2. Exclude the current character
        subseq(str, idx + 1, newString, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
      // String str = "abc";
      String str = "aaa";
        subseq(str, 0, "", set);
    }
}