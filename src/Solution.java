public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first=new ListNode(0);
        ListNode t1=l1,t2=l2,t=first;
        int r=0,v1=0,v2=0;
        while (t1!=null||t2!=null||r!=0)
        {
            if (t1!=null)
                v1=t1.val;
            if (t2!=null)
                v2=t2.val;
            r+=(v1+v2);

            t.next=new ListNode(r%10);
            t=t.next;
            r=r/10;
            if (t1!=null)t1=t1.next;
            if (t2!=null)t2=t2.next;

        }
        return first.next;
    }
}
