class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        int maxdiff = 0;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            int diff = nums[i+1]-nums[i];
            maxdiff = Math.max(maxdiff, diff);
            i++;
        }
        return maxdiff;
    }
}