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
public class BSTIterator {
        private Stack<TreeNode>st;
        public BSTIterator(TreeNode root) {
            st=new Stack<>();
            pushleft(root);
        }
        
        public int next() {
            TreeNode root=st.pop();
            pushleft(root.right);
            return root.val;
        }
        public void pushleft(TreeNode root){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
        }
        
        public boolean hasNext() {
            return !st.isEmpty();
        }
    }
