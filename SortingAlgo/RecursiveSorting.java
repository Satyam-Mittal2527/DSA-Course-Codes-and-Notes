import java.util.*;
class RecursiveSorting{
    public static int[] RecursiveBubbleSort(int[] arr, int n){
        if(n==1){
            return arr;
        }
        for(int j=0;j<n;j++){
            if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        arr = RecursiveBubbleSort(arr, n-1);
        return arr;
    }
    public static int[] RecursiveInsertionSort(int[] arr, int i){
        if(i==arr.length){
            return arr;
        }
        int j = i;
        while(j>0 && arr[j-1]> arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;

            j--;
        }
        i=i+1;
        arr = RecursiveInsertionSort(arr, i);
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arr = RecursiveBubbleSort(arr, n);
        arr = RecursiveInsertionSort(arr,0);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}