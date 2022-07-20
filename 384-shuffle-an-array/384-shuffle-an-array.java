class Solution {
    private int[] nums;
    private Random random;
    
    
    public Solution(int[] nums) {
        
        this.nums = nums;
        this.random = new Random();
        
    }
    
    public int[] reset() {
        return nums;
        
    }
    
    public int[] shuffle() {
        int[] nums2= nums.clone();
        for(int i=nums.length-1; i>0;i--)
        {
            //random
            int rad=random.nextInt(i+1);
            //swap
            int temp =nums2[i];
            nums2[i] = nums2[rad];
            nums2[rad]=temp;
        }
        return nums2;
    }
}
