import java.util.ArrayList;
import java.util.Stack;

public class nextSamllerElem {
    
 public int[] prevSmaller(int[] a) {
     int size=a.length;
	 Stack<Integer> s=new Stack<>();
     ArrayList<Integer>v=new ArrayList<>();
		for(int i=0;i<size;i++){
	     while(!s.isEmpty() && s.peek()>=a[i]){
			 s.pop();
		 }	 
		 if(i<size){
			 if(s.isEmpty()){
				 v.add(-1);
			 }
			 else{
				 v.add(s.peek());
			 }
		 }
		 s.push(a[i]);
		}
      return v.stream().mapToInt(i -> i).toArray();
    }
}
