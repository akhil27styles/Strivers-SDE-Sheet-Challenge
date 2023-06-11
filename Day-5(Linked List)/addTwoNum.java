   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class addTwoNum {
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1,temp2=l2;
        ListNode ans=new ListNode();
        ListNode list=ans;
        int carry=0;
        while(temp1!=null || temp2!=null || carry==1){
            int sum=0;
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null) {
                sum+=temp2.val;
                temp2=temp2.next;  
            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            ans.next=node;
            ans=ans.next;
        }
        return list.next;
    }    
}
