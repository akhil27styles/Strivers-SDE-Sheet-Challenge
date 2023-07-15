import java.util.*;
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class cloneAgraph {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Map<Node,Node>map=new HashMap<>();
        Queue<Node>q=new ArrayDeque<>();
        q.add(node);
        map.put(node,new Node(node.val,new ArrayList<>()));
        while(!q.isEmpty()){
            Node h=q.poll();
            for(Node neighbour:h.neighbors){
                if(!map.containsKey(neighbour)){
                  map.put(neighbour,new Node(neighbour.val,new ArrayList<>()));  
                  q.add(neighbour);
                }
                map.get(h).neighbors.add(map.get(neighbour));
            }
        }
        return map.get(node);
    }
}