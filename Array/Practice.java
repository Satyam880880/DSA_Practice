import java.util.*;
public class Practice {
    public static void rainfall(int arr[]){
        // total
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("Total railfall"+ " "+sum);
        System.out.println("Average railfall"+" "+ sum/(arr.length));
        
        // Lowest rainfall
        int max = Integer.MAX_VALUE;
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(max > arr[i]){
                max = arr[i];
                idx = i+1;
            }
        }
        System.out.println("Lowest railfall month"+" "+ idx);
        // largest rainfall
        int min = Integer.MIN_VALUE;
        int id = -1;
        for(int i=0;i<arr.length;i++){
            if(min < arr[i]){
                min = arr[i];
                id = i+1;
            }
        }
        System.out.println("Highest railfall month"+ " "+id);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12;
        int arr[] = new int[n];
        for(int i =0;i<12;i++){
            int input = sc.nextInt();
            if(input < 0){
                System.out.println("Invalid Input");
                return;
            }
            arr[i] = input;
        }
        rainfall(arr);
    }
}
