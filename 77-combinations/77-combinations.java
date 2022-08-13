class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> sub=new ArrayList<>();
        gen(1,n,new ArrayList(),sub,k);
        return sub;
    }
    void gen(int start, int n, List<Integer> cur, List<List<Integer>> sub, int k)
    {
        if(cur.size() == k){
            sub.add(new ArrayList(cur));
            return;
        }
        for(int i= start;i<= n;i++)
        {
            cur.add(i);
            gen(i+1,n,cur,sub,k);
            cur.remove(cur.size() -1);
        }
    }
}