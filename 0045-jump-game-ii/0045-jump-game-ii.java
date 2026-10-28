class Solution {
    public int jump(int[] nums) {
    int n = nums.length;
    int jump = 0;
    int maxjmp=0;
    int current=0;
    for(int i=0; i<n-1; i++){
       maxjmp = Math.max(maxjmp,nums[i]+i);
       if(i==current){
        jump++;
        current = maxjmp;
       } 
    }    
    return jump;
    }
}