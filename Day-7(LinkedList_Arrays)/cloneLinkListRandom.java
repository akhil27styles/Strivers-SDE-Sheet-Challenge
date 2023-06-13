class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class cloneLinkListRandom {
     public Node copyRandomList(Node head) {
         if(head==null){
            return null;
        }
        Node curr=head;
        //inserting new nodes
        while(curr!=null){
            Node temp=curr.next;
            curr.next=new Node(curr.val);
            curr.next.next=temp;
            curr=temp;
        }
        curr=head;
      
        //setting random pointers
        while(curr!=null){
            if(curr.next!=null){
                curr.next.random=(curr.random!=null)?curr.random.next:null;
            }
            curr=curr.next.next;
        }
        Node orig=head,copy=head.next,temp=copy;
        //seperating list
        while(orig!=null){
            orig.next=orig.next.next;
            copy.next=(copy.next != null) ? copy.next.next  : copy.next;
            orig=orig.next;
            copy=copy.next;
        }
        return temp;
    }
}
