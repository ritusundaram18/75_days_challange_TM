class Solution {
    public int sumSubarrayMins(int[] arr) {
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        Stack<int[]>s1=new Stack<>();
        Stack<int[]>s2=new Stack<>();
       
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            while(!s1.isEmpty() && arr[i]<s1.peek()[0])
            {
                count+=s1.pop()[1];
            }
            s1.push(new int[]{arr[i],count});
            left[i]=count;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            int count=1;
            while(!s2.isEmpty() && arr[i]<=s2.peek()[0])
            {
                count+=s2.pop()[1];
            }
            s2.push(new int[]{arr[i],count});
            right[i]=count;
        }
       
        long sum=0,mod = (int)1e9 + 7;
        for(int i=0;i<arr.length;i++)
        {
            sum=(sum+(long)arr[i]*left[i]*right[i])%mod;
        }
        return (int)sum;
    }
}