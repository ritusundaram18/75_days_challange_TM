/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> result=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null)
            return result;
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty())
        {
            Node cur = stack.pop();
            result.add(cur.val);
            
            for(int i=cur.children.size()-1;i>=0;i--)
                stack.push(cur.children.get(i));
        }
        return result;
    }
}