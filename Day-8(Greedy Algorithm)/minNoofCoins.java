public class minNoofCoins {
    public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int coins[]= {1,2,5,10,20,50,100,500,1000};
        int ans=0;
        int i=coins.length-1;
       while(i>=0 && amount>=0){
           if(amount-coins[i]>=0){
               amount-=coins[i];
               ans++;
           }
           else{
               i--;
           }
       }
       return ans;
    }
}
