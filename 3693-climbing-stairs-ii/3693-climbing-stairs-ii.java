class Solution {
    public int climbStairs(int n, int[] costs) {
    // Method 2 Bottom Up Approach;
    int [] dp = new int[n+1];
    dp[1] = costs[0]+1;
    if(n==1) return dp[1];

    dp[2] = Math.min(costs[1]+4, dp[1]+costs[1]+1);
    if(n==2) return dp[2];

    dp[3] = Math.min(costs[2]+9,Math.min(dp[1]+costs[2]+4, dp[2]+costs[2]+1));
    if(n==3) return dp[3];

    for (int i = 4; i <= n; i++) {
    dp[i] = Math.min(dp[i-3]+costs[i-1]+9, Math.min(dp[i-2]+costs[i-1]+4, dp[i-1]+costs[i-1]+1));
        }

        return dp[n];
    } 
} 

// Method 1 = topdown
/* public int climbStairs(int n, int[] costs) {
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
    } */