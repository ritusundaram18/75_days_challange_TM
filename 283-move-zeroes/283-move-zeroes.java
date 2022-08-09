class Solution {
    public void moveZeroes(int[] nums) {
    
       int idx = 0;
        for(int i=0;i< nums.length;i++)
        {
          if(nums[i] != 0)
          {
              nums[idx] = nums[i];
              if(idx != i)
              {
                  nums[i] = 0;
              }
              idx++;
          }
        }
      
    }
}
//ek idx declre karo
//i->0 to a.l
//agar nums of [i] 0 nahi hai toh nums[idx] pe nums[i] dalo aur fir check karo  idx AUR i barbaer nahi hai na
//, agar nahi hai toh  nums[i] me zero daal do aur idx ++
//CONCLUSION
//PHELE [IDX] pe  i daalo
//fir [i] pe 0 dalo