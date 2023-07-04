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
public class symm {
    //1stway
       public boolean mirror(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null ) return true;
        if(r1==null || r2==null ) return false;
        
        if(r1.val!=r2.val) return false;
        boolean left =  mirror(r1.left, r2.right);
        boolean right = mirror(r1.right, r2.left);
        return left && right;
    }
    public boolean isSymmetric(TreeNode root) {
      return mirror(root,root);
    }
    //2nd way
     public boolean isSymmetricQue(TreeNode root){
     Queue<TreeNode>q=new LinkedList<>();
       q.add(root);
       q.add(root);
       while(!q.isEmpty()){
          TreeNode a=q.poll();
          TreeNode b=q.poll();
           if(a==null&&b==null) continue;
           if(a==null||b==null) return false;
           if(a.val!=b.val)     return false;
          q.add(a.left);
          q.add(b.right);
          q.add(a.right);
          q.add(b.left);
       }
       return true;
   }
}
