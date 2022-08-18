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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode it=dummy;
        ListNode prev=null;
        
        for(int i=0;i<left;i++)
        {
            prev=it;
            it=it.next;
        }
        ListNode itR=it;
        ListNode prevR=prev;
        
        for(int i=left;i<=right;i++)
        {
            ListNode forward=itR.next;
            itR.next=prevR;
            prevR=itR;
            itR=forward;
        }
        
        prev.next=prevR;
        it.next=itR;
        
        
        return dummy.next;
    }
}