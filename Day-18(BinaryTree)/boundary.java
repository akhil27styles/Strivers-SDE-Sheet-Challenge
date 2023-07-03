import java.util.* ;  
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

public class boundary {
    public static ArrayList<Integer> traverseBoundary(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (!isLeaf(root)) {
            ans.add(root.data);
        }
        addLeft(root, ans);
        addLeaf(root, ans);
        addRight(root, ans);
        return ans;
    }

    public static boolean isLeaf(TreeNode node) {
        return (node.left == null) && (node.right == null);
    }

    public static void addLeaf(TreeNode root, ArrayList<Integer> ans) {
        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }
        if (root.left != null) {
            addLeaf(root.left, ans);
        }
        if (root.right != null) {
            addLeaf(root.right, ans);
        }
    }

    public static void addLeft(TreeNode root, ArrayList<Integer> ans) {
        TreeNode cur = root.left;
        while (cur != null) {
            if (!isLeaf(cur)) {
                ans.add(cur.data);
            }
            if (cur.left != null) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
    }

    public static void addRight(TreeNode root, ArrayList<Integer> ans) {
        TreeNode cur = root.right;
		 ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (!isLeaf(cur)) {
                tmp.add(cur.data);
            }
            if (cur.right != null) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        for (int i = tmp.size() - 1; i >= 0; --i) {
            ans.add(tmp.get(i));
        }
    }
}