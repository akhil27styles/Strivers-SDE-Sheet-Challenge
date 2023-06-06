import java.util.ArrayList;
public class findDupli {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int slow=0,fast=0;
        do{
            slow=arr.get(slow);
            fast=arr.get(arr.get(fast));
        }
        while(slow!=fast);
        slow=0;
        while(slow!=fast){
            slow=arr.get(slow);
            fast=arr.get(fast);
        }
        return slow;
    }
}
