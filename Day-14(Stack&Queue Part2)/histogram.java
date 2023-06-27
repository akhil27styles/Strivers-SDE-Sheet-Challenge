import java.util.Stack;

public class histogram {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer>s=new Stack<>();
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
               s.pop();
            }
            if(s.isEmpty()) nsl[i]=0;
            else nsl[i]=s.peek()+1;
            s.push(i);
        }
        while(!s.isEmpty()) s.pop();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
               s.pop();
            }
            if(s.isEmpty()) nsr[i]=n-1;
            else nsr[i]=s.peek()-1;
            s.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
       max = Math.max(max, heights[i] * (nsr[i] - nsl[i] + 1));
        }
        return max;
    }
}
