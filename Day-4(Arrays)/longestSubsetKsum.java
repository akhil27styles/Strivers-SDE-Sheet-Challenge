import java.util.* ;
public class longestSubsetKsum {
	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer,Integer>h=new HashMap<>();
        int sum=0,max=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum==0){
                max=i+1;
            }
            if(h.containsKey(sum)){
                max=Math.max(i-h.get(sum),max);
            }
            else{
                h.put(sum,i);
            }
        }
        return max;
	}
}
