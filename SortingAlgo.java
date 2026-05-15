import java.util.*;
class SelectionSort{
    public static int[] SelectionSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]< arr[min]){
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
    public static int[] BubbleSort(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            int didSwap =0;
            for(int j=0; j<i;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        
        return arr;
    }
    public static int[] InsertionSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]> arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        // arr = SelectionSort(arr,n);
        arr = BubbleSort(arr,n);
        arr = InsertionSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}