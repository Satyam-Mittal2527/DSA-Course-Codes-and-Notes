class Solution {
    public static int[] swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b]  =temp;

        return nums;

    }
    public static int[] reverse(int[] nums, int low, int high){
        if(low>=high){
            return nums;
        }
        nums = swap(nums, low, high);
        low++;
        high--;
        nums = reverse(nums, low, high);

        return nums;

    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int break_point = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                break_point = i;
                break;
            }
           
        }
        if(break_point!=-1){
            for(int i=n-1;i>break_point;i--){
                    if(nums[i] > nums[break_point]){
                        nums = swap(nums,i, break_point);
                        break;
                    }
            }
        }
        nums = reverse(nums,break_point+1, n-1);
    }
}