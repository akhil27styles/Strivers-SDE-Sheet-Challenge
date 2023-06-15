
import java.util.* ;
class job{
    int dead;
    int profit;
    job(int dead,int profit){
        this.dead=dead;
        this.profit=profit;
    }
}
public class jobSeq
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        ArrayList<job>a=new ArrayList<>();
        for(int i[]:jobs){
               a.add(new job(i[0],i[1]));
        }
        Collections.sort(a,(a1,a2)->(a2.profit-a1.profit));
        int max=0;
        for(int i=0;i<jobs.length;i++){
            if(a.get(i).dead>max){
                max=a.get(i).dead;
            }
        }
        int mark[]=new int[max+1];
         Arrays.fill(mark,-1);
        int job=0,profit=0;
        for(int i=0;i<jobs.length;i++){
            for(int j=a.get(i).dead;j>0;j--){
                if(mark[j]==-1){
                    mark[j]=i;
                    job++;
                    profit+=a.get(i).profit;
                    break; 
                }
            }
        }
        System.out.println(job);
        return profit;

    }
}

