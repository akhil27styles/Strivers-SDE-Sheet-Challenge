 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class constBst {
     public TreeNode sortedArrayToBST(int[] nums) {
        int i=0,j=nums.length-1;
        return help(nums,i,j);
    }
    public TreeNode help(int[] nums,int i,int j){
        if(i>j) return null;    
        int mid=(i+j)/2;
        TreeNode root=new TreeNode(nums[mid]);
            root.left=help(nums,i,mid-1);
            root.right=help(nums,mid+1,j);
        return root;
    }
}
