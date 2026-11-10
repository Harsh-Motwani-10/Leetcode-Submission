class Solution {
    public int climbStairs(int n) {
      int[] dp = new int [n];
      Arrays.fill(dp,-1);
      return stairCount(0,n,dp);
    }
    public int stairCount(int i,int n, int[]dp){
    if(i>=n-1) return 1;
    if(dp[i]!=-1) return dp[i];
    return dp[i]= stairCount(i+1,n,dp)+ stairCount(i+2,n,dp);
    }
}