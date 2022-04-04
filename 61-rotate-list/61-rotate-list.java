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
    public ListNode rotateRight(ListNode head, int k) {
        //1.check the age cases
        if(head == null || head.next == null || k == 0)
            return head;
        //2compute the length
        ListNode cur = head;
        int len = 1;
        while(cur.next != null)
        {
            len++;
            cur = cur.next;
        }
        //3 go till that node
        cur.next = head;
            // k = k%len;
            k=len-k%len;
        while(k-- >0)
            cur = cur.next;
        //4. make the node head and break the connection
        head= cur.next;
        cur.next = null;
        
    return head;
    }
}