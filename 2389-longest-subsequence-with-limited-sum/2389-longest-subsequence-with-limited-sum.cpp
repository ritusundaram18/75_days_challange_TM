// class Solution {
// public:
//     vector<int> answerQueries(vector<int>& nums, vector<int>& queries) {
        
//     }
// };

class Solution {
public:
    vector<int> answerQueries(vector<int>& nums, vector<int>& queries) {
 
        vector<int>temp=nums;
 
        sort(begin(temp),end(temp));
 
        //prefix sum
        int n=nums.size();
        for(int i=1;i<n;++i){
          temp[i]+=temp[i-1];
        }
 
 
        int sz=queries.size();
        vector<int>ans(sz);
        int i=0;
        for(auto it:queries){
 
            //lower_bound
         int idx=lower_bound(begin(temp),end(temp),it)-begin(temp);
 
            //if I find it in array of prefix
         if(idx!=n){
             // sum that I want is Not present
             if(temp[idx]>it){
 
                 --idx;
                 //out of bound
                 if(idx>=0){
                  //inside the bound
                     ans[i]=idx+1;   
                 }
                 else{
                  ans[i]=0;
                 }
             }
             else{
                 ans[i]=idx+1;
             }
 
         }
            else{
                //out of bound decrease the index
                   --idx;
                //edge case or the bounds check
                   if(idx>=0 && temp[idx]>it){
                  //again go back if we cannot take it     
                  --idx;
                   //bound check    
                  if(idx>=0){
                  ans[i]=idx+1;   
                   }
                  else{
                  ans[i]=0;
                  } 
              }
                else{
                  ans[i]=idx+1;
                }
            }
 
            ++i;
        }
 
        return ans;
    }
};