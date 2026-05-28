class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
        int sum = nums[i];
        int required = target - sum;
        if(map.containsKey(required)){
            return new int[]{i, map.get(required)};
        }else{
            map.put(sum,i);
        }
       }
       return new int[]{-1,-1};
    }
}