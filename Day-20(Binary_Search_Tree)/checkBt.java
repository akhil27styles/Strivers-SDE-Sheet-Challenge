 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class checkBt {
        public boolean isValid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(min!=Long.MIN_VALUE && root.val<=min) return false;
        if(max!=Long.MAX_VALUE && root.val>=max) return false;
        
        return isValid(root.left,min,root.val)&&isValid(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
       return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
