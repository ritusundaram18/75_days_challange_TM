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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> {
            return a.val - b.val;
        });
        for(ListNode l: lists) if(l != null) pq.add(l);
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        while(pq.size() != 0)
        {
            ListNode node = pq.remove();
            
            prev.next = node;
            prev = prev.next;
            node = node.next;
            
            if(node != null)
                pq.add(node);
        }
        return dummy.next;
        
    }
}






/*
PriorityQueue<ListNode> minHeap = new  PriorityQueue<>((a,b) -> a.val-b.val);
        
        for(int i=0; i<lists.length;i++){
            if(lists[i] != null) {
                minHeap.add(lists[i]);
            }
        }
        ListNode ans = null;
         ListNode final_ans = ans;
        
        while(minHeap.size() > 0){
            ListNode top = minHeap.remove();
            if(top.next != null){
                minHeap.add(top.next);
            }
            if(ans == null){
                ans = top;
                final_ans = top;
            } else {
                ans.next =top;
                ans =ans.next;
            }
        }
        return final_ans;
*/