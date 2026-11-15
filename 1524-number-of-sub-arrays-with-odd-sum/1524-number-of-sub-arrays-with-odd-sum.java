class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int cnt = 0, oddCount = 0, evenCount = 1, prefixSum = 0;

        for(int num : arr){
            prefixSum += num;

            if(prefixSum % 2 == 0){
                cnt = (cnt + oddCount) % MOD;
                evenCount++;
            }else{
                cnt = (cnt + evenCount) % MOD;
                oddCount++;
            }
        }
        return cnt;
    }
}