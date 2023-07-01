//https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
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
static ArrayList<Integer> topView(Node root)
{
// add your code
ArrayList<Integer> ll=new ArrayList<>();
TreeMap<Integer,Integer> mp=new TreeMap<>();
Queue<Pair> q=new LinkedList<Pair>();
q.add(new Pair(root,0));
while(!q.isEmpty()){
Pair p=q.poll();
Node curr=p.node;
int d=p.hd;
if(mp.containsKey(d)==false){
mp.put(d,curr.data);
}
if(curr.left!=null){
q.add(new Pair(curr.left,d-1));
}
if(curr.right!=null){
q.add(new Pair(curr.right,d+1));
}
}

for(Map.Entry<Integer,Integer> x: mp.entrySet()){

ll.add(x.getValue());
}

return ll;

}
}
