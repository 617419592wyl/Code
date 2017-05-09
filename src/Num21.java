import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/1.
 */
public class Num21 {
    //递归
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        if(l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)
            return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode start1=l1;
        ListNode start2=l2;
        ListNode start=new ListNode(0);
        ListNode begin=start;
        while(start1!=null||start2!=null){
            if(start2==null||(start1!=null&&start1.val<=start2.val)){
                start.next=new ListNode(start1.val);
                start1=start1.next;
                start=start.next;
            }
            else if(start1==null||(start2!=null&&start1.val>start2.val)){
                start.next=new ListNode(start2.val);
                start2=start2.next;
                start=start.next;
            }
        }
        return begin.next;
    }
    public static void main(String[] args){
        Num21 num21=new Num21();
        ListNode l3=new ListNode(1);
        ListNode l4=new ListNode(2);
        System.out.print(num21.mergeTwoLists(l3,l4).val);
    }
}
