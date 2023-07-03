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
public class balance {
      public int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
           if(root==null) return true;
         return isBalanced(root.left)&&isBalanced(root.right)
             &&(Math.abs(height(root.left)-height(root.right))<=1);
    }
}
