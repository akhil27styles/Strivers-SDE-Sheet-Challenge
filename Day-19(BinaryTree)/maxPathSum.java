class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class maxPathSum {
 int ans=0;
    public int maxPathsum(TreeNode root) {
        help(root);
        return ans;
    }
    public int help(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,help(root.left));
        int right=Math.max(0,help(root.right));
        ans=Math.max(ans,left+right+root.val);
        return root.val+Math.max(left,right);
    }    
}
