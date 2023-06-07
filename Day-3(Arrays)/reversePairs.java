import java.util.ArrayList;

public class reversePairs {
    
    public static int reversepairs(ArrayList<Integer> arr) 
    {
        return mergeSort(arr, 0, arr.size()- 1); 
    }
    public static int mergeSort(ArrayList<Integer> arr, int lo,int hi){
        if(lo>=hi) return 0;
        int mid=(lo+hi)/2;
        int cnt=0;
        cnt+=mergeSort(arr,lo,mid);
        cnt+=mergeSort(arr,mid+1,hi);
        cnt+=merge(arr,lo,mid,hi);
        return cnt;
    }
    public static int merge(ArrayList<Integer> arr,int lo,int mid,int hi){
        int cnt=0;
        int j=mid+1;
        for(int i=lo;i<=mid;i++){
            while(j<=hi && arr.get(i)>2*arr.get(j)) {
                j++;
            }
            cnt+=(j-(mid+1));
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int left = lo, right = mid+1;
        while(left<=mid && right<=hi){
            if(arr.get(left)<=arr.get(right)){ 
                temp.add(arr.get(left++));
            }
            else  {
                temp.add(arr.get(right++));
            }
        }
        while(left<=mid){
            temp.add(arr.get(left++));
        }
         while(right<=hi){
            temp.add(arr.get(right++));
        }
        for(int i=lo;i<=hi;i++){
            arr.set(i,temp.get(i - lo)); 
        }
        return cnt;
    }
}