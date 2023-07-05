public class countSay {
  public String countAndSay(int n) {
     String cur="1";
     if(n==1) return cur;
     for(int i=2;i<=n;i++){
       StringBuilder sb = new StringBuilder();
       int count=1;
       char prev=cur.charAt(0);
       for(int j=1;j<cur.length();j++){
           if(cur.charAt(j)==prev){
               count++;
           }
           else{
               sb.append(count).append(prev);
               count=1;
               prev=cur.charAt(j);
           }
       }
        sb.append(count).append(prev);
        cur=sb.toString();
     }
     return cur;
    }    
}
