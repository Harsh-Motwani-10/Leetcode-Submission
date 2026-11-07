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
     PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

     ListNode dummy = new ListNode(-1);
     ListNode t = dummy;
     for(ListNode node : lists){
        if(node==null) continue;
        pq.add(node);             //heads of each ll are inserted in pq         
     } 
     while(pq.size()!=0){
        ListNode a = pq.poll();
        t.next = a;
        t = t.next;
        if (a.next != null) {
            pq.add(a.next);
        }
     }
     return dummy.next;
    }
}