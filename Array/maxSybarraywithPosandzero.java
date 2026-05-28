

class Solution {
    public int maxSybarraywithPosandzero(int[] arr, int k) {
        // code here
        int left = 0, right=0;
        int sum = arr[0];
        int maxLen = 0;
        while(right < arr.length){
            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if(right< arr.length){
                sum+= arr[right];
            }
        }
        return maxLen;
    }
}
