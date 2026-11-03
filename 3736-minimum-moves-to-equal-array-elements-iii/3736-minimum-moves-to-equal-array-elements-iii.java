class Solution {
    public int minMoves(int[] nums) {
        int max =-1;
        int sum =0;
        for(int ele: nums){
            max= Math.max(ele,max);
        }
        for(int ele: nums){
            sum+=(max-ele);
        }
        return sum;
    }
}