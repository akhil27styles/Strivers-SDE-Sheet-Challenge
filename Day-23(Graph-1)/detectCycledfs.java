import java.util.*;
public class detectCycledfs {
    
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(checkcycle(i,-1,vis,adj)){
                    return true;
                }
            }
        }
        return false;
    }
public boolean checkcycle(int node,int parent,boolean vis[],ArrayList<ArrayList<Integer>>adj){
     vis[node]=true;
     for(Integer x:adj.get(node)){
         if(vis[x]==false){
         if(checkcycle(x,node,vis,adj)){
             return true;
         }
         }
         else if(x!=parent){
             return true;
         }
     }
        return false;
    }
}