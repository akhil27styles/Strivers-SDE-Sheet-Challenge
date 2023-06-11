public class mergeTwoSorted {
    	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
		// Write your code here.
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.data>list2.data){
           LinkedListNode<Integer> temp=list1;
           list1=list2;
           list2=temp;
        }
       LinkedListNode <Integer>res=list1;
        while(list1!=null && list2!=null){
            LinkedListNode <Integer> temp=null;
            while(list1!=null && list1.data<=list2.data){
                temp=list1;
               list1=list1.next;
            }
            temp.next=list2;
            //swap
            LinkedListNode <Integer> tem=list1;
            list1=list2;
            list2=tem;
        }
        return res;
	}
}
