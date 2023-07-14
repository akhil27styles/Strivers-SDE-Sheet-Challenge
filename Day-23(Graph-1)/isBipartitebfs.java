import java.util.*;
public class isBipartitebfs {

    public boolean bfscheck(int node,int graph[][],int color[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        color[node]=-1;
        while(q.isEmpty()==false){
            Integer nde=q.poll();
            for(Integer it:graph[nde]){
                if(color[it]==-1){
                    color[it]=1-color[nde];
                    q.add(it);
                }
                else if(color[it]==color[nde]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            color[i]=-1;
        }
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                 if(!bfscheck(i,graph,color)){
                     return false;
                 }
            }
            
        }
        return true;
    }
}