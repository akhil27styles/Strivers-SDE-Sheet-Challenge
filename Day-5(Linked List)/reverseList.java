class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

public class reverseList {
     public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> prev=null,next=null,temp=head;
		while(temp!=null){
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		return prev;
    }
}
