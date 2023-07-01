import java.util.*;

class Pair{
Node node;
int hd;
Pair(Node temp,int d){
node=temp;
hd=d;
}
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
ArrayList<Integer> ll=new ArrayList<>();
TreeMap<Integer,Integer> mp=new TreeMap<>();
Queue<Pair> q=new LinkedList<Pair>();
q.add(new Pair(root,0));
while(!q.isEmpty()){
Pair p=q.poll();
Node curr=p.node;
int d=p.hd;
mp.put(d,curr.data);
if(curr.left!=null){
q.add(new Pair(curr.left,d-1));
}
if(curr.right!=null){
q.add(new Pair(curr.right,d+1));
}
}
for(Integer p:mp.keySet()){
    ll.add(mp.get(p));
}


return ll;
        
    }
}
