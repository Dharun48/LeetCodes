class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tail=new ListNode(0);
        ListNode list3=tail;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
            list3.next=list1;
            list1=list1.next;
            }
            else
            {
            list3.next=list2;
            list2=list2.next;
            }
            list3=list3.next;
        }
        if(list1!=null)
        {
            list3.next=list1;
        }
        else
        {
            list3.next=list2;
        }
        return tail.next;
    }
}