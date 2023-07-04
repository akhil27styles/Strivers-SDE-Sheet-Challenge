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
public class consBinaryTreePostIn {
     int index;
    HashMap<Integer,Integer>map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        index=postorder.length-1;
        return help(inorder,postorder,0,postorder.length-1);
    }
    public TreeNode help(int[] inorder, int[] postorder,int l,int h){
        if(l>h){
            return null;
        }
        TreeNode node=new TreeNode(postorder[index--]);
        int mid=map.get(node.val);
        node.right=help(inorder,postorder,mid+1,h);
        node.left=help(inorder,postorder,l,mid-1);
    return node;
    }
}
