public class linkedListCycleII {
        public ListNode detectCycle(ListNode head) {
          if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
            slow=slow.next;
        }
        return null;
    }
}
