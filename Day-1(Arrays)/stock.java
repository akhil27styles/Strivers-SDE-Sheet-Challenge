import java.util.ArrayList;
public class stock {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        Integer prev=null,max=0;
        for(Integer curr:prices){
            if(prev==null) prev=curr;
            if(prev>curr){
                prev=curr;
            }
            max=Math.max(max,curr-prev);
        }
        return max;
    }
}
