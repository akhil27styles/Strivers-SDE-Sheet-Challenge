class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
public class kthLarg {
    int ans=-1;
    int x=0;
    public void reverseInorder(Node root, int k){
         if(root==null) return;
                reverseInorder(root.right,k);
        x++;
         if(k==x) {
             ans=root.data;
             return;
          }
                reverseInorder(root.left,k);
     }
    public int kthLargest(Node root,int K)
    {
        //Your code here
        reverseInorder(root,K);
        return ans;
    }    
}
