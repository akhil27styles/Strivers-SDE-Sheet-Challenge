import java.util.*;
class Node {
      int val;
      Node left;
      Node right;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node left, Node right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class mirrorImage {
      void mirror(Node node) {
        // Your code here
        if(node==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
        Node temp=q.poll();
        if(temp.left!=null) q.add(temp.left);
        if(temp.right!=null) q.add(temp.right);
        Node dum=temp.left;
        temp.left=temp.right;
        temp.right=dum;
        }
    }
}
