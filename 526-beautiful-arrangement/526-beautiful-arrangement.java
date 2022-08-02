class Solution {
     int count =0;
    public int countArrangement(int n) {
        
       
        int arr[] = new int[n];
        
        for(int i=0; i<n;i++)
        {
            arr[i]=i+1;
        }
        check(arr,0);
        return count;
    }
    
    public void check(int arr[], int j)
    {
        if(j == arr.length)
            count++;
        for(int i=j;i<arr.length;i++)
        {
            swap(arr,i,j);
            if(arr[j]%(j+1) == 0 ||(j+1)%arr[j]==0)
          
            check(arr,j+1);
            swap(arr,i,j);
            
        }
    }
    
    public void swap(int[] arr,int i, int j)
    {
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
}