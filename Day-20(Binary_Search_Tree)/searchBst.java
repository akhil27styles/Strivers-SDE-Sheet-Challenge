 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class searchBst {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null && root.val!=val){
          root=val>root.val?root.right:root.left;
        }
        return root;
    }    
}
