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
public class zigzag {
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                if(flag){
                l.add(temp.val);
                }
                else{
                    l.add(0,temp.val);
                }
            }
            ans.add(l);
            flag=!flag;
        }
        return ans;
    }    
}
