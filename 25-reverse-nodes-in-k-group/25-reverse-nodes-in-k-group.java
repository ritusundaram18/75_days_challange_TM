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
    ListNode tt = null;
    ListNode th = null;
    
    public void addFirst(ListNode node)
    {
        if(th == null)
        {
            th = node;
            tt = node;
        }
        else
        {
            node.next = th;
            th = node;
        }
    }
    public int length(ListNode node)
    {
        ListNode cur = node;
        int len = 0;
        
        while(cur != null)
        {
            cur = cur.next;
            len++;
        }
        return len;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next ==null || k== 0)
            return head;
        
        ListNode oh=null;
        ListNode ot =null;
        int len =length(head);
        ListNode cur = head;
        
        while(len >= k)
        {
            int tempk = k;
            while(tempk-- > 0)
            {
                ListNode forw = cur.next;
                cur.next = null;
                addFirst(cur);
                cur = forw;
            }
            if(oh == null)
            {
                oh = th;
                ot =tt;
            }
            else
            {
                ot.next = th;
                ot=tt;
            }
            tt = null;
            th = null;
            len -=k;
        }
        ot.next = cur;
        return oh;
    }
}