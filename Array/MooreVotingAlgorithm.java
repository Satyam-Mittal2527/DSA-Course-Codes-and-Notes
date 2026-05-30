class Solution {
    public int majorityElement(int[] nums) {
        int count  =0;
        int element= Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                element = nums[i];
                count=1;
            }
            else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        int counter =0;
        int n_half = n/2;
        for(int i=0;i<n;i++){
            if(nums[i] == element){
                counter++;
            }
            if(counter > n_half){
                return element;
            }
        }
        return -1;
    }
}