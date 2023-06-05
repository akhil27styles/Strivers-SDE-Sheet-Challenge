public class Modular_Exponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
          long ans=1,xx=x;     
           while(n>0){
               if(n%2==1){
                ans=((ans)*(xx))%m;
                 n-=1;
               }
               else{
                   xx=(xx*xx)%m;
                   n/=2;
               }
           }
           return (int)ans%m;
    }
}
