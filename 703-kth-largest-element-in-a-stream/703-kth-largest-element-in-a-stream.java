class KthLargest {
    
    Queue<Integer> minHeap;
    int max;

    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        
    for(int i = 0; i < nums.length; i++)
    {
        minHeap.add(nums[i]);
    }
        max=k;
    }
    
    public int add(int val) {
        minHeap.add(val);
        while(minHeap.size() > max){
            minHeap.remove();
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */