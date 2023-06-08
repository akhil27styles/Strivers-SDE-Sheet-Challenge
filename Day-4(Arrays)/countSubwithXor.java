import java.util.* ;
public class countSubwithXor {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		HashMap<Integer,Integer>h=new HashMap<>();
		h.put(0,1);
		int xor=0,cnt=0;
		for(int i=0;i<arr.size();i++){
			 xor=xor^arr.get(i);
			int isKSubarray=x^xor;
        if(h.containsKey(isKSubarray)){
          cnt+=h.get(isKSubarray);
		}
		if(h.containsKey(xor)){
			h.put(xor,h.get(xor)+1);
		}
		else{
			h.put(xor,1);
		}
		}
		return cnt;
	}    
}
