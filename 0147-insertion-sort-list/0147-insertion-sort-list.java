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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = head.next;
        ListNode lastSort = head;

        while(curr!=null){
            ListNode next = curr.next;

            if(lastSort.val <= curr.val) lastSort = curr;
            else{
                ListNode  prev = dummy;

                while(prev.next != null && prev.next.val < curr.val){
                    prev=prev.next;
                }
                curr.next = prev.next;
                prev.next = curr;
                lastSort.next = next; 
            }
            curr = next;
        }
        return dummy.next;
    }
}