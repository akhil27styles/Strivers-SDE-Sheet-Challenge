import java.util.*;
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
public class consBinaryTreePreIn {
     int index;
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
       index=0;
    return helper(inorder,preorder,0,preorder.length-1);
    }
    public TreeNode helper(int[] inorder,int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index++]);
        int mid=map.get(root.val);
        root.left=helper(inorder,preorder,start,mid-1);
        root.right=helper(inorder,preorder,mid+1,end);
    return root;
    }
}
