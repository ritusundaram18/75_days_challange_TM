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
class Solution {
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null)
            return ;
        
        ListNode slow =head;
        ListNode fast=head;
        ListNode prev=head;
        
        while(fast !=null && fast.next != null)
        {
            prev =slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        prev.next = null;
        // /make two list
        ListNode l1=head;
        ListNode l2=reverse(slow);;
        //call revers and merge
        
        
        merge(l1,l2);
        
    }
    
    public ListNode reverse(ListNode slow)
    {
       ListNode cur=slow;
        ListNode next=null;
        ListNode prev=null;
        
        while(cur != null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    //merge
    public void merge(ListNode l1,ListNode l2)
    {
        while(l2 !=null)
        {
            ListNode temp=l1.next;
            l1.next=l2;
            l1=l2;
            l2=temp;
        }
    }
}