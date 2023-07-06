 class Node {
      int data;
      Node left;
      Node right;
      Node(int x) { data = x; }
  }
public class findInandSuc {
        static Node pre=null;
         static Node suc=null;


 public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
    
   pre(root,key);
   suc(root,key);
}
private static void pre(Node root, int key){

    while(root!=null){
        if(key>root.data){
            pre=root;
            root=root.right;
        }else root=root.left;
    }
}
private static void suc(Node root, int key){
    while(root!=null){
        if(key<root.data){
            suc=root;
            root=root.left;
        }else root=root.right;
    }
}
}
