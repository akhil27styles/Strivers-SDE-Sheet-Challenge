import java.util.*;
public class distNumWind {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        HashMap<Integer,Integer>h=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
         for(int i=0;i<B;i++){
           h.put(A.get(i),h.getOrDefault(A.get(i),0)+1);
         }
         ans.add(h.size());
         for(int i=B;i<A.size();i++){
             if(h.get(A.get(i-B))==1){
                 h.remove(A.get(i-B));
             }
             else{
                 h.put(A.get(i-B),h.get(A.get(i-B))-1);
             }
                h.put(A.get(i),h.getOrDefault(A.get(i),0)+1);
                ans.add(h.size());
         }
         return ans;
    }    
}
