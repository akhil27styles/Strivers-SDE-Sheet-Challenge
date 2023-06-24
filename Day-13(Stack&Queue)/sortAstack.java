import java.util.* ;
public class sortAstack {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
	Stack<Integer> sortedStack = new Stack<>();
		while(!stack.isEmpty()){
			int temp=stack.pop();
			while(!sortedStack.isEmpty()&&sortedStack.peek()<temp){
               stack.push(sortedStack.pop());
			}
			sortedStack.push(temp);
		}
		while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
	}

}