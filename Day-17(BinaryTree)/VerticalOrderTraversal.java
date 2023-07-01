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
public class VerticalOrderTraversal {
    // Vertical Order Traversal Function
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // if, root is null, return new ArrayList
        if(root == null) return new ArrayList<>();
        // create a queue
        Queue<Pair> q = new LinkedList<>();
        // create a treeMap
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        
        // add root value to queue
        q.add(new Pair(0, root));
        
        // while q is not empty
        while(!q.isEmpty()) {
            // calculate size of queue
            int size = q.size();
            // create a Hashmap
            HashMap<Integer, List<Integer>> levelMap = new HashMap<>();
            // while size is greater than 0
            while(size > 0) {
                // remove the current element from queue
                Pair current = q.poll();
                // update the horizontal distance
                int distance = current.hd;
                // create a list
                List<Integer> nodeList = levelMap.getOrDefault(distance, new ArrayList<>());
                // add the current node value to the nodeList
                nodeList.add(current.node.val);
                // sort the nodeList
                Collections.sort(nodeList);
                // & then added to the map
                levelMap.put(distance, new ArrayList<>(nodeList));
                
                // if, left is not null, added the children of left subtree
                // for left side horizontal distance decrease by 1
                if(current.node.left != null) {
                    q.add(new Pair(distance-1, current.node.left));
                }
                
                // if, right is not null, added the children of right subtree
                // for right side horizontal distance increase by 1
                 if(current.node.right != null) {
                    q.add(new Pair(distance+1, current.node.right));
                }
                // decrease the size by 1 in each iteration
                size--;
            }
            
            
             // Update the map with levelMap values
            for(Map.Entry<Integer,List<Integer>> entry : levelMap.entrySet()) {
            List<Integer> nodeList = map.getOrDefault(entry.getKey(), new ArrayList<>());
                nodeList.addAll(entry.getValue());
                map.put(entry.getKey(), nodeList);
                
            }
        }
        return new ArrayList<>(map.values());
    }
    
    // create class pair
    class Pair {
        int hd; // horizontal distance
        TreeNode node;
        public Pair(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }
}