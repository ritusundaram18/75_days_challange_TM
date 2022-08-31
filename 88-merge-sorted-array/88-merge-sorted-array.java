class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[m+n];
        int a = 0,b = 0;
        int c=0;
        while(a<m && b<n)
        {
            if(nums1[a]<nums2[b])
            {
                temp[c++]=nums1[a++];  
            
            }
            else
            {
                temp[c++]=nums2[b++];
            }   
        }
        if(a<m)
        {
            for(int i=c;i<m+n;i++)
            {
                temp[i]=nums1[a++];
            }
        }
        else if(b<n)
        {
             for(int i=c;i<m+n;i++)
            {
                temp[i]=nums2[b++];
            }
        }
          for(int j=0;j<m+n;j++)
          {
              nums1[j]=temp[j];
          }
            
    }
}