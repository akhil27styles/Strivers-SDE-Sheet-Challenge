import java.util.* ;
public class morrispreOrder {
       static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.

         List<Integer> preorder = new ArrayList<Integer>(); 
         TreeNode cur = root;
         while(cur!=null){
             if(cur.left==null){
                 preorder.add(cur.data);
                 cur=cur.right;
             }
             else{
                 TreeNode prev=cur.left;
                 while(prev.right!=null && prev.right!=cur){
                     prev=prev.right;  
                 }
                 if(prev.right==null){
                     prev.right=cur;
                    preorder.add(cur.data);
                     cur=cur.left;
                 }
                 else{
                     prev.right=null;
                     cur=cur.right;
                 }
             }
         }
         return preorder;
    }
}
