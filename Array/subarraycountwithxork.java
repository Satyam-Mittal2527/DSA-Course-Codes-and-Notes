class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int prefix_xor = 0;
      HashMap<Integer, Integer> map= new HashMap<>();
      int count = 0;
      map.put(0,1);
      int n = nums.length;
      for(int i=0;i<n;i++){
        prefix_xor ^=nums[i];

        int rem = prefix_xor ^ k;
        if(map.containsKey(rem)){
            count += map.get(rem);
        }
        map.put(prefix_xor, map.getOrDefault(prefix_xor , 0)+1);
      }

      return count;
    }
}