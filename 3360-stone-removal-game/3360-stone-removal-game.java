class Solution {
    public boolean canAliceWin(int n) {
     if(n<10) return false;
     int remove=10;
      while(n>=remove){
        n-=remove;
        remove--;
      }  
      return remove%2!=0;
    }
}