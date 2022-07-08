class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int[] a:bookings)
        {
            ans[a[0]-1] +=a[2];
            if(a[1]<n) ans[a[1]] -=a[2];
        }
        for(int i=1; i<n; i++)
        {
            ans[i] +=ans[i-1]; 
        }
        return ans;
    }
}