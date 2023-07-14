import java.util.*;
public class detectCyclebfs {
    
 //Function to detect cycle in an undirected graph.
    public boolean checkcycle(int x,boolean vis[],int parent[], ArrayList<ArrayList<Integer>> adj)
    {
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{x,-1});
        vis[x]=true;
        while(!q.isEmpty()){
            int node=q.peek()[0];
            int par=q.peek()[1];
            q.poll();
            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    q.add(new int[]{it,node});
                    vis[it]=true;
                }
                else if(it!=par) return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean vis[]=new boolean[V];
        Arrays.fill(vis,false);
        int parent[]=new int[V];
        Arrays.fill(parent,-1);
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(checkcycle(i,vis,parent,adj)){
                    return true;
                }
            }
        }
        return false;
    }
}