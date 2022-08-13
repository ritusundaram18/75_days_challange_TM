class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> sub = new ArrayList();
        gen(1,9,new ArrayList(),sub,k,n);
        return sub;
    }
    
    void gen(int start, int end, List<Integer> cur,List<List<Integer>> sub, int k, int target)
    {
        if(target == 0  && cur.size() ==k)
        {
            sub.add(new ArrayList(cur));
            return;
        }
        for(int i=start;i<=end;i++)
        {
            cur.add(i);
            gen(i+1,end,cur,sub,k,target-i);
            cur.remove(cur.size()-1);
        }
    }
}