class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double sum=0;
        
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i] < min)
            {
                min=salary[i];
            }
           if (salary[i]>max)
                max=salary[i];            
        }
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i] !=max && salary[i]!=min)
            {
                sum +=salary[i];
            }
        }
        return sum/(salary.length-2);
        
        
    }
}