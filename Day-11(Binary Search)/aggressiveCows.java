import java.util.Arrays;

public class aggressiveCows {
      public static boolean isPossible(int a[], int n, int cows, int minDist){
       int cntCows=1;
       int lastPicked=a[0];
       for(int i=1;i<n;i++){
           if(a[i]-lastPicked>=minDist){
               cntCows++;
               lastPicked=a[i];
           }
       }
       return cntCows>=cows;
    }
    public static int aggressiveCow(int []stalls, int k) {
        //    Write your code here.
         int n=stalls.length;
         Arrays.sort(stalls);
         int low = 1, high = stalls[n - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) >> 1;

            if (isPossible(stalls, n, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
