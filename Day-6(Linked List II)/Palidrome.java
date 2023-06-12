public class Palidrome {
    public ListNode rev(ListNode head){
        ListNode prev=null,next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next; 
        }
        return prev;
    }
    public ListNode mid(ListNode head){
        ListNode slow=head,fast=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode temp1=head;
        ListNode temp2=mid(head);
        System.out.println(temp2.val);
      //  temp2.next=rev(temp2.next);
       // temp2=temp2.next;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}
