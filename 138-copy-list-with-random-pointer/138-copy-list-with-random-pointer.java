/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node curr=head;
        Node temp;
        while(curr!=null)
        {
            temp=new Node(curr.val);
            temp.next=curr.next;
            curr.next=temp;
            curr=temp.next;
        }
       
        curr=head;
        while(curr!=null)
        {
            if(curr.random!=null)
            {
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
       
        curr=head;
        Node ans=curr.next;
        Node c=ans;
        while(curr!=null)
        {
            curr.next=curr.next.next;
            if(c.next!=null)
            {
                c.next=c.next.next;
            }
            curr=curr.next;
            c=c.next;
        }
       
        return ans;
    }
}