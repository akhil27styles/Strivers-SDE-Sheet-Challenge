class Node {
     public int data;
     public Node next;
     public Node bottom;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.bottom = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.bottom = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.bottom = child;
     }
 }
public class flattenList {
      public static Node merge(Node a,Node b){
        Node temp=new Node(0);
        Node res=temp;
        while(a!=null && b!=null){
            if(a.data>b.data){
                temp.bottom=b;
                b=b.bottom;
                temp=temp.bottom;
            }
            else if(a.data<b.data){
                temp.bottom=a;
                a=a.bottom;
                temp=temp.bottom;
            }
        }
        if(a!=null) temp.bottom=a;
        else temp.bottom=b;
        return res.bottom;
    }
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        if(head==null || head.next==null) return head;
        head.next=flattenLinkedList(head.next);
        head=merge(head,head.next);
        return head;
    }
}
