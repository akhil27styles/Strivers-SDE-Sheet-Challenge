  class TreeNode<T>
    {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };
public class ceil {
    public  static int findCeil(TreeNode<Integer> node, int x) {

        // Write your code here
        if(node==null) return -1;
        int ceil=-1;
        while(node!=null){
            if(node.data==x) return node.data;
            else if(node.data>x){
                ceil=node.data;
                 node=node.left;
            }
            else{
                node=node.right;
            }
        }
        return ceil;
    }    
}
