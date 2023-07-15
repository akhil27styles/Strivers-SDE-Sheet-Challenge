
import java.util.*;
class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v,int wt){
        this.wt=wt;
        this.v=v;
    }
    public int compareTo(Pair that){
        return this.wt-that.wt;
    }
}
public class PrimsAlgoMST
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        boolean vis[]=new boolean[V];
        PriorityQueue<Pair>q=new PriorityQueue<>();
        q.add(new Pair(0,0));
        int ans=0;
        while(q.size()!=0){
            Pair node=q.remove();
            int u=node.v;
            if(vis[u]) {
                continue;
            }
            ans+=node.wt;
            vis[u]=true;
            ArrayList<ArrayList<Integer>>neigh=adj.get(u);
            for(ArrayList<Integer>list:neigh){
                int vertex=list.get(0);
                int weight=list.get(1);
                if(vis[vertex]==false){
                    q.add(new Pair(vertex,weight));
                }
            }
        }
        return ans;
    }
}
