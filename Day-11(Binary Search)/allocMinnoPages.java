public class allocMinnoPages {
  public boolean isFeasible(int A[],int B,int mid){
        int student=1,sum=0;
        for(int i:A){
          if(sum+i>mid){
              student++;
              sum=i;
          }
          else{
              sum+=i;
          }
        }
       return student<=B;
    }
    public int books(int[] A, int B) {
        if(A==null || A.length==0){
           return -1; 
        }
        if(B==0 || B>A.length){
            return -1;
        }
        int min=A[0];
        int max=A[0];
         for (int i =1; i < A.length; i++) {
            max += A[i];
            if (A[i] > min) {
                min = A[i];
            }
        }
        int res=-1;
        if(B==1){
            return max;
        }

        while(min<=max){
            int mid=(min+max)>>1;
            if(isFeasible(A,B,mid)){
                res=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return res;
    }    
}
