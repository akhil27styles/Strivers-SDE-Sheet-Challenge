import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longSubWithoutRepChar {
    //1st way
     static int solve(String s) {
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
    //2nd way
    public static int uniqueSubstrings(String s) 
    {
		//write your code here
		 Set<Character>h=new HashSet<>();
        int curr=0,prev=0,max=0;
        while(curr<s.length()){
            if(h.contains(s.charAt(curr))){
                h.remove(s.charAt(prev++)); 
            }
            else{
                h.add(s.charAt(curr++));
                max=Math.max(max,(curr-prev));
            }
        }
        return max;
	}
}
