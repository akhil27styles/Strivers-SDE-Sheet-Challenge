import java.util.* ;
    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

public class BottomView {
   static class pair{
    BinaryTreeNode node;
    int d;
    pair(BinaryTreeNode node,int d){
        this.node=node;
        this.d=d;
    }
}
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
         // Write your code here.         
          ArrayList<Integer>ans=new ArrayList<>();
          TreeMap<Integer,Integer>map=new TreeMap<>();
          Queue<pair>q=new LinkedList<>();
          q.add(new pair(root,0));
          while(!q.isEmpty()){
              pair p=q.poll();
              BinaryTreeNode curr=p.node;
              int d=p.d;
              map.put(d,curr.val);
              if(curr.left!=null){
                  q.add(new pair(curr.left, d-1));
              }
               if(curr.right!=null){
                  q.add(new pair(curr.right, d+1));
              }
          }
          for(Integer it:map.keySet()){
              ans.add(map.get(it));
          }
          return ans;
    }
}
