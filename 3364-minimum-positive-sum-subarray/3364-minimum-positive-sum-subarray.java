class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum =Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<Math.min(n,i+r); j++){
                sum+=nums.get(j);
                if(sum>0 && j-i+1>=l) minSum= Math.min(minSum,sum);
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}