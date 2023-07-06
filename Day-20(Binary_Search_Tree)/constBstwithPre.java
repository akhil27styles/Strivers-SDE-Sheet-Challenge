 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class constBstwithPre {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder==null) return null;
        int size=preorder.length;
        if(size==0) return null;
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<size;i++){
            help(preorder[i],root);
        }
        return root;
    }
    public void help(int val,TreeNode r){
        TreeNode root=r;
        TreeNode node=new TreeNode(val);
        while(root!=null){
            if(val<root.val){
                if(root.left==null){
                   root.left=node;
                   break;
                }
                else{
                    root=root.left;
                }
            }
            else{
               if(root.right==null){
                   root.right=node;
                   break;
                }
                else{
                    root=root.right;
                }
            }
        }
    }
}
