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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
    
        ListNode fast=head;
        ListNode slow= head.next;
        
        ListNode p=fast;
        ListNode q=slow;
        
        while(fast.next != null && slow.next !=null)
        {
            fast.next=slow.next;
            fast=slow.next;
            slow.next=fast.next;
            slow=fast.next;
            // head=head.next;
        }
        // slow.next=null;
        fast.next=q;
        return p;
        
    }
}