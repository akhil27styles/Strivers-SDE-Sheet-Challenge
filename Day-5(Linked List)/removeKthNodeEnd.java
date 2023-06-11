    class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
    }
public class removeKthNodeEnd {

     public static Node removeKthNode(Node head, int K)
    {
        if (head == null || head.next == null) {
            return null;
        }
        
        Node dummy = new Node();
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;
        
        // Move fast pointer n nodes ahead
        for (int i = 0; i <= K; i++) {
            fast = fast.next;
        }
        
        // Move slow and fast pointers together until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Remove the nth node from the end
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
