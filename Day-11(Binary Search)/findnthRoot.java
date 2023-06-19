
public class findnthRoot {
 public static int NthRoot(int n, int m) {
        // Write your code here.
        int l=1,hi=m;
        while(l<=hi){
            int mid=(l+hi)/2;
            int temp=(int)Math.pow(mid,n);
            if(temp==m) return mid;
            else if(temp>m){
                hi=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }    
}
