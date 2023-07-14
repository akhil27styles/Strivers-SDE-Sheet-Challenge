import java.util.*;
public class topoSortdfs {
 //Function to return list containing vertices in Topological order. 
    static void dfs(int node,boolean vis[],Stack<Integer>s,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int x:adj.get(node)){
            if(vis[x]==false){
                dfs(x,vis,s,adj);
            }
        }
        s.push(node);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
       Stack<Integer>s=new Stack<>();
       boolean vis[]=new boolean[V];
       Arrays.fill(vis,false);
       for(int i=0;i<V;i++){
           if(vis[i]==false){
              dfs(i,vis,s,adj);
           }
       }
    int a[]=new int[s.size()];
    int i=0;
    while(!s.isEmpty()){
         a[i++]=s.pop(); 
    }
  
    return a;
}
}