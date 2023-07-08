import java.util.*;
public class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {}
    
    public void addNum(int num) {
        if(maxHeap.size()>0 && num>maxHeap.peek()){
          minHeap.offer(num);
        }
        else{
            maxHeap.offer(num);
        }
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }
        if(minHeap.size()>maxHeap.size()+1){
            maxHeap.offer(minHeap.poll());
        }
        System.out.println(minHeap.peek()+","+maxHeap.peek());
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
           return (maxHeap.peek()+minHeap.peek())/2.0;
        }
          if(maxHeap.size()>minHeap.size()){
              return maxHeap.peek();
          }
          else{
               return minHeap.peek();
          }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */