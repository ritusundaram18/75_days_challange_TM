class Solution {
    public int countPrimes(int n) {
 
        
        int[] sieve=new int[n+1];
        
        for(int i = 0; i < sieve.length; i++){
            sieve[i] = 1;
        }
        
        for(int i = 2; i*i <= n; i++){
            
            if(sieve[i]==1){
                for(int j = i*i; j <= n; j = j + i){
                    sieve[j] = 0;
                }
            }   
        }
        int res = 0;
        for(int i = 2 ; i < sieve.length-1; i++){
            if(sieve[i]==1) res++;
        }
        return res;
    }
}