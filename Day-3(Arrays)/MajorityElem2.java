import java.util.* ;
public class MajorityElem2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int elem1=0,elem2=0,count1=0,count2=0,n=arr.size();
        for(int v:arr){
            if(count1==0 && v!=elem2){
                count1=1;
                elem1=v;
            }
            else if(count2==0 && v!=elem1){
                count2=1;
                elem2=v;
            }
            else if(elem1==v) count1++;
            else if(elem2==v) count2++;
            else {
                count1--; count2--;
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        count1=0; count2=0;
        for(int i:arr){
           if(i==elem1) count1++;
           if(i==elem2) count2++;
        }
        int mini=(int)(n/3)+1;
        if(count1>=mini) ans.add(elem1);
        if(count2>=mini) ans.add(elem2);
        Collections.sort(ans);
        return ans;

    }    
}
