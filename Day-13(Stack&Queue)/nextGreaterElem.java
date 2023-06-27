import java.util.Stack;

public class nextGreaterElem {
    	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		int ans[]=new int[n];
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<n;i++){
		    while(!s.isEmpty()&&arr[i]>=s.peek()){
			   s.pop();
			  }
			  if(i<n){
               int elem=s.isEmpty()?-1:s.peek();
			   ans[i]=elem;
			  }
			s.push(arr[i]);
		}
		return ans;
	}
}
