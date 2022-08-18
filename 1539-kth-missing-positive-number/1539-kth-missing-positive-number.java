class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int a[]=new int[2000];
        
        // for(int[] r:arr)
        for(int r=0;r<arr.length;r++)
        {
            a[arr[r]-1]=1;
        }
        
       int c=0;
        while(k!=0)
        {
            if(a[c] ==0)
                k--;
            c++;
        }
        return c;
    }
}
        