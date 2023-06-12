public class IntersectionTwo {
     public int len(ListNode head){
        int i=0;
        while(head!=null){
            head=head.next;
            i++;
        }
        return i;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=len(headA),l2=len(headB);
        if(l1>l2){
           getIntersectionNode(headB,headA);
        }
        while(l1!=l2 && headB!=null){
            headB=headB.next;
            l2--;
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
             headB=headB.next;
             headA=headA.next;
        }
        return null;
    }
}
