class Solution {
    public int[] twoSum(int[] nums, int target) {
         if(nums.length == 0 || nums.length < 2){
            return new int[]{-1,-1};
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int n = target - nums[i];

            if(map.containsKey(n)) return new int[] {map.get(n), i};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}