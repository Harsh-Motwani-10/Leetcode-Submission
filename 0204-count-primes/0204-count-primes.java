class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        return sieve(n,primes);
    }

    private static int sieve(int n, boolean[] primes) {
        int count = 0;
        for(int i=2; i*i<n; i++){
            if(!primes[i]){
                for (int j=i*2; j<n; j+= i){
                    primes[j] = true;
                }
            }
        }
        for (int i=2 ; i<n; i++){
            if(!primes[i]){
               count++;
            }
        }
        return count;
    }
}