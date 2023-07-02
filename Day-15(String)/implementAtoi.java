public class implementAtoi {
      public int myAtoi(String s) {
        if(s==null || s.length()==0) return 0;
        int i=0,sign=1,res=0;
        //skip spaces
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        //check sign
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        //convert digit to int
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(res>(Integer.MAX_VALUE-digit)/10){ 
             //cause the value of res to exceed the maximum value
                if(sign==1){
                    return  Integer.MAX_VALUE;
                }
                else{
                    return  Integer.MIN_VALUE;
                }
            }
             res=res*10+digit;
              i++;
        }
        return res*sign;
    }
}
