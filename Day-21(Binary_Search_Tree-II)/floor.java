  class TreeNode<T>
    {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

public class floor {
    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
       if(root==null) return -1;
       int floor=root.data;
        while (root != null) {
        if (root.data == X) {
            return root.data;
        } else if (root.data > X) {
            root = root.left;
        } else {
            floor = root.data;
            root = root.right;
        }
    }
       return floor;
    }
}
