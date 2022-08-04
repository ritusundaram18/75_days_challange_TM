class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numberSet =new HashSet<>();
        while(n!=1)
        {
            int current =n;
            int sum =0;
            while(current !=0){
                int rem=current%10;
                sum +=rem*rem;
                current = current/10;
            }
            if(numberSet.contains(sum))
                return false;
            
            n=sum;
            numberSet.add(n);
        }
        return true;
        
    }
}