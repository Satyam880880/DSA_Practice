public class HeapSort {
    public void heapify(int arr[],int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxidx = i; 
         if(left < size && arr[maxidx] < arr[left]){  
             maxidx = left;
         }
         if(right < size && arr[maxidx] < arr[right]){
             maxidx = right;
         }
          
         if(maxidx != i){  
             int temp = arr[i];
             arr[i] = arr[maxidx];
             arr[maxidx] = temp;
            
             heapify(arr,maxidx,size);
         }
        }
    public static void heapSort(int arr[]){
        // step 1 Build maxHeap
            int n = arr.length;
            for(int i = n/2; i>=0;i--){
            //heapify(arr,i,n);
            new HeapSort().heapify(arr,i,n);
            }
        // step 2 largest element at the end
           for(int i=n-1;i>0;i--){
              // swap lagest- first with last
              int temp = arr[0];
              arr[0] = arr[i];
              arr[i] = temp;
              // heapify root element
                new HeapSort().heapify(arr,0,i);
           }

    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
