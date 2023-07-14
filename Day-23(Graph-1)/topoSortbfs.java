import java.util.*;

public class topoSortbfs {
 //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int ind[]=new int[V];
        int topo[]=new int[V];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            for(Integer it:adj.get(i)){
               ind[it]++;
            }
        }
        for(int i=0;i<V;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int j=0;
        while(!q.isEmpty()){
            Integer node=q.poll();
            topo[j]=node;
            j++;
            for(Integer it:adj.get(node)){
                ind[it]--;
                if(ind[it]==0){
                    q.add(it);
                }
            }
        }
        return topo;
    }
}