
import java.util.*;
public class ImpQueueUsingStack {
    // Define the data members(if any) here.
    Stack<Integer>input;
    Stack<Integer>output;
    ImpQueueUsingStack() {
        // Initialize your data structure here.
        input=new Stack<Integer>();
        output=new Stack<Integer>();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        input.push(val);
    }

    int deQueue() {
        // Implement the dequeue() function.
        if(isEmpty()) return -1;
          sortOut();
          return output.pop();
    }

    int peek() {
        // Implement the peek() function here.
         if(isEmpty()) return -1;
         sortOut();
         int val=output.pop();
         output.push(val);
          return val;
    }
    void sortOut(){
    if(output.isEmpty()){
      while(!input.isEmpty()){
            output.push(input.pop());
        }
      }
    }
    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return input.size()==0&&output.size()==0;
    }
}
