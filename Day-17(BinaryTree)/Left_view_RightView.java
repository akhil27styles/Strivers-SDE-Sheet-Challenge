// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#
import java.util.*;
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
     ArrayList<Integer>list=new ArrayList<>();
     if(root==null){
         return list;
     }
     LinkedList<Node>q=new LinkedList<>();
     q.addLast(root);
     while(q.size()>0){
         list.add(q.getFirst().data);
         int size=q.size();
         while(size-->0){
             Node temp=q.removeFirst();
             if(temp.left!=null) q.addLast(temp.left);
             if(temp.right!=null) q.addLast(temp.right);
         }
     }
     return list;
    }
}

// ----------------------------------------------------------------------------------
// In right view simple replce position of if conditions
// video-https://youtu.be/QTWQSgD9HJ8
