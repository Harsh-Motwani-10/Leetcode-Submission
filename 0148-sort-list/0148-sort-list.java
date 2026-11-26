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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next =null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){ 
                t.next = head1;
                head1 = head1.next;
                }
            else{ 
                t.next=head2;
                head2=head2.next;
                }
            t=t.next;
        }
        if(head1 != null) t.next = head1;
        if(head2 != null) t.next = head2;
        return dummy.next;
    }
}