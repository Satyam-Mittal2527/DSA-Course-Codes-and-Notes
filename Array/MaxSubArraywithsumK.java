import java.util.*;
class MaxSubArraywithsumK{
    int MaxArray(int[] arr, int k){
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum==k){
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                int len  = i- map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = MaxArray(arr,k);
        System.out.println(max);
    }
}