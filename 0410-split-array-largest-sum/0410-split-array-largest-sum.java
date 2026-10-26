class Solution {
    public int splitArray(int[] nums, int k) {
     if(nums.length<k) return -1;
     int max =0, sum=0;
     for(int ele: nums){
        max = Math.max(ele,max);
        sum += ele;
     }
     int lo=max; 
     int hi=sum;
     while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(maxPartsOfArray(nums,mid) <= k){
            hi = mid-1;
        }
        else lo = mid+1;
     }
        return lo;
    }
    public int maxPartsOfArray(int[] nums, int mid){
        int sum = 0;
        int parts = 1;
        for(int ele:nums){
            if(sum+ele<= mid) sum+=ele;
            else{
                parts++;
                sum = ele;
            }
        }
        return parts;
    }
}