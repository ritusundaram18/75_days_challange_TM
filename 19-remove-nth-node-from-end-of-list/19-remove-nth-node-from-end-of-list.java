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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode start = new ListNode();
    start.next = head;
        ListNode fast;
        ListNode slow;
        fast = start;
        slow = start;
        
        // movve the fast by n position
        for(int i=1; i<= n; i++)
        {
            fast = fast.next;
        }
        // difference maintaion karo
        while(fast.next!= null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        //connection thodo
        slow.next = slow.next.next;
        
        return start.next;
    }
}