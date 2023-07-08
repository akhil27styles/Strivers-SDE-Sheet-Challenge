 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
public class convBtToDD {
    static BinaryTreeNode<Integer> head;
	static BinaryTreeNode<Integer> prev;
	public static void inorder(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}
		inorder(root.left);
	    if(prev==null) head=root;
		else{
          prev.right=root;
		  root.left=prev;
		}
		prev=root;
		inorder(root.right);
	}
	
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		// Write your code here
		head=null;
		prev=null;
		inorder(root);
		return head;
	}
}
