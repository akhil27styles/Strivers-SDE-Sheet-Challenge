
   class BinaryTreeNode < Integer > {
        int data;
        BinaryTreeNode < Integer > left;
        BinaryTreeNode < Integer > right;

    public BinaryTreeNode(int data) {
            this.data = data;
        }
    }
public class childSumProp {
    public static void changeTree(BinaryTreeNode < Integer > root) {
        // Write your code here.
        if(root==null){
            return;
        }
        int child=0;
        if(root.left!=null){
            child+=root.left.data;
        }
        if(root.right!=null){
            child+=root.right.data;
        }
        if(child>=root.data) root.data=child;
        else{
            if(root.left!=null) root.left.data=root.data; 
            if(root.right!=null) root.right.data=root.data;
        }
        changeTree(root.left);
        changeTree(root.right);
        int to=0;
        if(root.left!=null) to+=root.left.data;
        if(root.right!=null) to+=root.right.data;
        if(root.left!=null || root.right!=null) root.data=to;
    }
}
