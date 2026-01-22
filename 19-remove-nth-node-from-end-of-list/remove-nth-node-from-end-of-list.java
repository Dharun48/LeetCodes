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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int length=0;
       ListNode cur=head;

       while(cur!=null)
       {
        length++;
        cur=cur.next;
       }
       cur=head;
       if(n==length)
       {
        return head.next;
       }
       for(int i=1;i<length-n;i++)
       {
          cur=cur.next;
       }
       cur.next=cur.next.next;
       return head;
    }
}