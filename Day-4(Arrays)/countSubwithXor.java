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


// 4, 2, 2, 6, 4
// 4=100
// 2=10
// 6=110
// where k=6
// ----
// [

// 0,1
// ]
// elem as 4
// 4^k=2 did not come previous
// [
// 4,1
// 0,1
// ]
// elem as 2
// 4^2=6
// 6^k=0(come previous)
// cnt+1
// [
// 6,1
// 4,1
// 0,1
// ]
// elem as 2
// 6^2=4
// 4^k=2  did not come previous
// [
// 6,1
// 4,2
// 0,1
// ]
// elem as 6
// 4^6=2
// 2^k=4 come previous
// cnt+getcount of 4=2
// cnt+=2
// [
// 2,1
// 6,1
// 4,2
// 0,1
// ]
// elem as 4
// 2^4=6
// 6^k=0 come previous
// cnt+ get count of 0
// cnt+=1






