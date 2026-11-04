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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy =new ListNode(-1);
        
        ListNode l3 = dummy;
       int carry=0;
       while(l1!= null || l2!=null || carry!=0){
        ListNode sum = new ListNode();

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        int ans = carry+val1+val2;
        carry=0;
        if(ans<=9){
        sum.val = ans;
        }
        else{
            carry = ans/10;
            sum.val = ans%10;
        }
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
        l3.next=sum;
        l3=l3.next;
       }
        
        return dummy.next;
    }
}