import java.util.*;
class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
public class Iterative_Traverasal
{ 
  Node root;  
   Iterative_Traverasal(int data){
       root=new Node(data);
   }
   Iterative_Traverasal(){
       root=null;
   }
    public static void InOrder(Node node) {
      if(node==null){
            return;
        }
        Stack<Node>st=new Stack<>();
        Node temp=node;
        while(temp!=null || !st.isEmpty()){
            while(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            temp=st.pop();
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
     }
     public static void preorder(Node node){
          if(node==null){
            return;
        }
        Stack<Node>st=new Stack<>();
        st.push(node);
        while(!st.isEmpty()){
             Node temp=st.pop();
             System.out.print(temp.data+" ");
            if(temp.right!=null){
                st.push(temp.right);
            }
            if(temp.left!=null){
                st.push(temp.left);
            }
        }
     }
     
      public static void postorder(Node node){
          if(node==null){
            return;
        }
        Stack<Node>st=new Stack<>();
        Stack<Integer>ot=new Stack<>();
        st.push(node);
        while(!st.isEmpty()){
            
             Node temp=st.pop();
             ot.push(temp.data);
            if(temp.left!=null){
                st.push(temp.left);
            }
            if(temp.right!=null){
                st.push(temp.right);
            }
        }
        while(!ot.isEmpty()){
            System.out.print(ot.pop()+" ");
        }
     }
}
