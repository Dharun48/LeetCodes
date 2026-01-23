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
    public boolean isPalindrome(ListNode head) {
       if(head==null&&head.next==null)
       {
        return true;
       }
       ListNode fast=head;
       ListNode slow=head;
       while(fast!=null&&fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode cur=slow;
       ListNode prev=null;
       while(cur!=null)
       {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
       }
       ListNode temp1=head;
       ListNode temp=prev;
       {
        while(temp!=null)
        {
            if(temp.val!=temp1.val)
            {
                return false;
            }

                temp=temp.next;
                temp1=temp1.next;

        }
       }
       return true;
    }
}