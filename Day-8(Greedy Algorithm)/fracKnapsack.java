import java.util.* ;
  class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
public class fracKnapsack {
 public static double maximumValue(Pair[] items, int n, int W) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
	Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

		int curWeight=0;
		double finalval=0.0;
		for(int i=0;i<n;i++){
			if(curWeight+items[i].weight<=W){
				curWeight+=items[i].weight;
				finalval+=items[i].value;
			}
			else{
				int remainWeight=W-curWeight;
				finalval+=((double)items[i].value/(double)items[i].weight)*(double)remainWeight;
				break;
			}
		}
        return finalval;
    }    
}
