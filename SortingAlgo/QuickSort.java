import java.util.*;
class QuickSort{
    public static int[] QuickSort(int[] arr, int low, int high){
        int i=low;
        int j= high;
        int pivotIndex = low;
        if(j<i){
            return arr;
        }
        while(j>i){
            while(arr[i]<= arr[pivotIndex] && i<high){
                i++;
            }
            while(arr[j] > arr[pivotIndex] && j>low){
                j--;
            }
            if(j>i){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[j];
        arr[j] = temp;
        QuickSort(arr, low, j-1);
        QuickSort(arr, j+1,high);
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        arr = QuickSort(arr, 0, num-1);
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
