class rotateLinkedList{
     public int length(ListNode head){
        int i=0;
        while(head!=null){
            head=head.next;
            i++;
        }
        return i;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int len=length(head);
        int diff=len-k;
        ListNode temp=head;
        ListNode prev=temp;
        while(temp!=null && diff-->0){
            prev=temp;
            temp=temp.next;
        }
        ListNode newHead=temp;
        prev.next=null;
        ListNode curr=newHead;
        while(curr.next!=null){
            curr=curr.next;
        }
       curr.next=head;
        return curr;
    }
}