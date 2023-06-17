import java.util.Arrays;

public class minNoOfPlatform {
       public static int calculateMinPatforms(int at[], int dt[], int n) {
      Arrays.sort(at);
      Arrays.sort(dt);
      int i=1,j=0,max=1,platform=1;
      while(i<n&& j<n){
          if(at[i]<=dt[j]){
              platform++;
              i++;
          }
          else{
              platform--;
              j++;
          }
           max=Math.max(max,platform);
      }
        return max;
    }
}
