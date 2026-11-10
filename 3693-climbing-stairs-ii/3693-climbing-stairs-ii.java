class Solution {
    public int climbStairs(int n, int[] costs) {
     int[] dp = new int[n+1]; 
     Arrays.fill(dp,-1);
     return cost(0,n,costs,dp);  
    } 
    public int cost(int i, int n, int[] costs, int[] dp){
        if(i==n) return 0;
        if(dp[i]!=-1) return dp[i];
        int minCost = Integer.MAX_VALUE;
        for(int jmp=1; jmp<=3; jmp++){
            if(i+jmp<=n){
                int currentCost = costs[i+jmp-1] + jmp*jmp + cost(i+jmp, n, costs, dp);

                minCost = Math.min(minCost, currentCost);
            }
        }
        return dp[i] = minCost;
    }
} 