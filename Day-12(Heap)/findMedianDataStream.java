import java.util.*;
public class findMedianDataStream  {
	public static void findMedian(int arr[])  {
        if(arr.length==0)return;
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        System.out.print(arr[0]+" ");
        max.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(max.size()>0&&arr[i]>max.peek()){
                min.add(arr[i]);
            }
            else{
                max.add(arr[i]);
            }
            if(max.size() > min.size()+1){
                min.add(max.remove());
            }
            if(min.size() > max.size()+1){
                max.add(min.remove());
            }
            if(max.size()==min.size()){
                System.out.print((int)(max.peek()+min.peek())/2+" ");
            }
            else if(max.size()>min.size()){
               System.out.print(max.peek()+" ");
           }
            else{
                System.out.print(min.peek()+" ");
            }
        }
    }
}