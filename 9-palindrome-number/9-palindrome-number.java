class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0, temp = x;
            int r = 0;
        while(temp>0)
        {
            r=temp%10;
            sum=(sum*10)+r;
            temp=temp/10;
            
        }
        if(sum==x)
            return true;
        else
            return false;
        
    }
}