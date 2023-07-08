import java.util.*;
public class KthLargest {
  final PriorityQueue<Integer>p;
  final int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        p=new PriorityQueue<>();
        for(int i:nums){
           add(i);
        }
    }
    
    public int add(int val) {
        p.add(val);
        if(p.size()>k){
            p.poll();
        }
        return p.peek();
    }
}