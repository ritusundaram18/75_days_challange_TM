//Brute force
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
 
        int res[] = new int [n];
        int start;
        int end;
        int seats;
        for(int j=0;j<bookings.length;j++){
            for(int i=bookings[j][0];i<=bookings[j][1];i++)
            {
                // int start = bookings[i][0];
                // int end = bookings[i][1];
                  seats = bookings[j][2];
                res[i-1] +=seats;
            }
        }
        return res;
    }
}


// class Solution {
//     public int[] corpFlightBookings(int[][] bookings, int n) {
//         int ans[] = new int[n];
//         for(int[] a:bookings)
//         {
//             ans[a[0]-1] +=a[2];
//             if(a[1]<n) ans[a[1]] -=a[2];
//         }
//         for(int i=1; i<n; i++)
//         {
//             ans[i] +=ans[i-1]; 
//         }
//         return ans;
//     }
// }