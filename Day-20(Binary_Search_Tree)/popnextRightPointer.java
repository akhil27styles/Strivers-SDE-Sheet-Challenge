class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class popnextRightPointer {
     public Node connect(Node root) {
       help(root);
       return root;
    }
    public void help(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        root.left.next=root.right;
        if(root.next!=null){
        root.right.next=root.next.left;
        }
        help(root.left);
        help(root.right);
    }
}
