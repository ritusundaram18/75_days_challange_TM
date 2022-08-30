/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//pepcoding undrestood it completely
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       
        
        ListNode dummy=new ListNode();
        ListNode curr=head;
        ListNode prev=dummy;
        ListNode start=null;
        int i=0;
        
        while(i<k && curr!=null)
        {
            if(i==0) start=curr;
            i++;
            curr=curr.next;
            if(i<k && curr==null)
            {
                prev.next=start;
            }
            if(i==k)
            {
                ListNode end=curr;
                ListNode rev=reverse(start,end);
prev.next=rev;
                prev=start;
                i=0;
            }
        }
        return dummy.next;
    
    }
    
    public ListNode reverse(ListNode start,ListNode end)
    {
        ListNode cur=null;
        ListNode prev=null;
        
        while(start !=end)
        {
            cur=start;
            start=start.next;
            cur.next=prev;
            prev=cur;
        }
        start=prev;
        return start;
    }
        
        
        
}