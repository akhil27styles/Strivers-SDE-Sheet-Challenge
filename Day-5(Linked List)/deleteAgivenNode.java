
public class deleteAgivenNode {
      class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }
      public void deleteNode(Node node) {
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
