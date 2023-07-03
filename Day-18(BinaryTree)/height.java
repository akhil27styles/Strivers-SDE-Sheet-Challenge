   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }
    
public class height {
 public int maxDepth(TreeNode root) {
        if(root==null){
         return 0;
        }
    int left=maxDepth(root.left);
    int right=maxDepth(root.right);
    return 1+Math.max(left,right);
        
    }    
}
