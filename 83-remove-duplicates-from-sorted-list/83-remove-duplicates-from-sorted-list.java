/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
 
 https://www.youtube.com/watch?v=GgLRB2V9R3o&t=52s  - SEE THIS VIDEO
 
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
            ListNode cur = head;
            while(cur != null){
                ListNode fwd = cur.next;
                cur.next = null;
                if(tt == null || tt.val != cur.val)  addLast(cur);
                cur = fwd;
            }
        return th;
    }
    ListNode th =null;
    ListNode tt = null;
    private void addLast(ListNode node){
            if(tt == null)    th=tt=node;
            else{
                tt.next = node;
                tt = node;
            }
        }
}