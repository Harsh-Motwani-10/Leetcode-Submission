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
      ListNode temp = head;
      ListNode temp1 = head;

      if(head==null || head.next==null || k==0) return head;
      int count = 1;
      while(temp.next!=null){
        temp = temp.next;
        count++;
      } 
      k=k%count;
      if(k==0) return head;
     
     for(int i=1; i<count-k; i++){
        temp1 = temp1.next;
     }
     temp.next=head;
     head=temp1.next;
     temp1.next=null;

     return head;
    }
}