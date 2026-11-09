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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a = head;
        ListNode b = slow.next;
        slow.next = null;
        // reverse from b
        ListNode prev = null;
       ListNode curr = b;
       while(curr!=null){
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr=temp;
       }
       b = prev; // new head of reverse list
       // join alterntively
        
       while(b!=null){
            ListNode nextA = a.next;
            ListNode nextB = b.next;
            a.next = b;
            b.next = nextA;
            a= nextA;
            b= nextB;
       }
       return;
    }
}