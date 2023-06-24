import java.util.* ;
public class maxSumCombination{
	private static class Combination{
      int sum;
	  int index1;
	  int index2;
	  Combination(int sum,int index1,int index2){
            this.sum=sum;
            this.index1=index1;
            this.index2=index2;
	  }	
	  }
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		// Write your code here.
		Collections.sort(a);
		Collections.sort(b);
		PriorityQueue<Combination> maxHeap = new PriorityQueue<>
		((x, y) -> y.sum - x.sum);
		maxHeap.add(new Combination(a.get(n-1)+b.get(n-1),n-1,n-1));
		Set<String>vis=new HashSet<>();
		vis.add("0,0");
		ArrayList<Integer> result = new ArrayList<>();
          for (int i = 0; i < k; i++) {
			  Combination curr=maxHeap.poll();
			  result.add(curr.sum);
			  int index1=curr.index1;
			  int index2=curr.index2;
			  if(index1-1>=0 && !vis.contains((index1-1)+","+(index2))){
                int sum = a.get(index1 - 1) + b.get(index2);
                Combination nextCombination = new Combination(sum, index1 - 1, index2);
                maxHeap.offer(nextCombination);
                vis.add((index1 - 1) + "," + (index2));
			  }
			  if(index2-1>=0 && !vis.contains((index1)+","+(index2-1))){
				  int sum=a.get(index1)+b.get(index2-1);
				  Combination nextCombination=new Combination(sum,index1,index2-1);
				  maxHeap.offer(nextCombination);
				  vis.add((index1)+","+(index2-1));
			  }
		  }
		  return result;
	}
}