import java.util.*;
   class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int val) {
		    this.val = val;
		    this.left = null;
		    this.right = null;
	    }

    }
public class levelOrderTrav {
  public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             List<Integer>a=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
              TreeNode r=q.poll();
                a.add(r.val);
                if(r.left!=null){
                q.add(r.left);
            }
            if(r.right!=null){
                q.add(r.right);
             }
            }
            ans.add(new ArrayList<>(a));
        }
        return ans;
    }    
}
