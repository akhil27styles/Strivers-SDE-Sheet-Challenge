import java.util.* ;
public class ImpStackUsingQueu  {

    // Define the data members.
    Queue<Integer>q;
    public ImpStackUsingQueu() {
        // Implement the Constructor.
        q=new LinkedList<Integer>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q.size()==0;
    }

    public void push(int element) {
        // Implement the push(element) function.
        q.offer(element);
    }

    public int pop() {
        // Implement the pop() function.
        if(isEmpty()) return -1;
        sortout();
        return q.poll();
    }

    public int top() {
        // Implement the top() function.
        if(isEmpty()) return -1;
        sortout();
        int val=q.poll();
        q.add(val);
        return val;
    }
    public void sortout(){
         int k=q.size();
        for(int i=k-1;i>=1;i--){
            q.add(q.poll());
        }
    }
}