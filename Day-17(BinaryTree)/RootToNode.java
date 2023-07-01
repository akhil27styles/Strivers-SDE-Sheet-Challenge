import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class RootToNode{
    static boolean getPath(Node root, ArrayList < Integer > arr, int x) {
        if (root == null)
            return false;
        arr.add(root.data);
        if (root.data == x)
            return true;
        if (getPath(root.left, arr, x) ||
            getPath(root.right, arr, x))
            return true;
        arr.remove(arr.size() - 1);
        return false;
    }
}