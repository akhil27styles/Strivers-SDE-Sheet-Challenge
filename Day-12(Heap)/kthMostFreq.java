import java.util.* ;
class Pair{
	int val;
	int freq;
	Pair(int val,int freq){
		this.val=val;
		this.freq=freq;
	}
	int getValue(){
		return val;
	}
	int getFreq(){
		return freq;
	}
}
public class kthMostFreq {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
		 Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
		PriorityQueue<Pair> maxHeap= new PriorityQueue<>((a,b)->(b.getFreq()
		-a.getFreq()));
		for(Integer it:map.keySet()){
			maxHeap.add(new Pair(it, map.get(it)));
		}
	    int ans[]=new int[k];
		int j=0;
      while(k-->0&&!maxHeap.isEmpty()){
          Pair pq=maxHeap.poll();
          ans[j++]=pq.getValue();
      }
      return ans;
	}    
}
