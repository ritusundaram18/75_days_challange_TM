public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        //REcursive
        if(n==0) return 0;
        if(n==1) return 1;
        return hammingWeight(n &(n-1)) +1;
        
        
        
        // int count=0;
        // while(n !=0)
        // {
        //     n=n &(n-1);
        //     count++;
        // }
        // return count;
    }
}