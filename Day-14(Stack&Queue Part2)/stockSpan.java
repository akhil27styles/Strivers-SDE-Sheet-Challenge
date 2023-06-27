import java.util.ArrayList;
import java.util.Stack;

public class stockSpan {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        Stack<int[]>s=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<Integer>();
        for(int i=0;i<price.size();i++){
            int span=1;
            while(!s.isEmpty() && s.peek()[0]<=price.get(i)){
                span+=s.pop()[1];
            }
            ans.add(span);
            s.push(new int[]{price.get(i),span});
        }
        return ans;
    }
}