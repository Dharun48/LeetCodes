/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int n=0,m=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null)
        {
            n++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            m++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(n>m)
        {
          int dif=n-m;
          while(dif-->0)
          {
            temp1=temp1.next;
          }  
        }
          else
          {
            int dif=m-n;
            while(dif-->0)
            {
                temp2=temp2.next;
            }
          }
      while(temp1!=null&&temp2!=null)
      {    
        if(temp1==temp2)
        { 
            return temp1;
        }
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
      }
      return null;
    }
}