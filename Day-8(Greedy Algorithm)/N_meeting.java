import java.util.* ;
class meeting{
    int start;
    int end;
    int pos;
     meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
public class N_meeting  {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
         ArrayList<meeting>m=new ArrayList<>();
         for(int i=0;i<start.length;i++){
             m.add(new meeting(start[i], end[i], i+1));
         }
         Collections.sort(m,(a,b)->(a.end==b.end)?(a.start-b.start):(a.end-b.end));
         ArrayList<Integer> answer = new ArrayList<>();
         answer.add(m.get(0).pos);
         int limit=m.get(0).end;
         for(int i=1;i<start.length;i++){
             if(m.get(i).start>limit){
                 limit=m.get(i).end;
                 answer.add(m.get(i).pos);
             }
         }
         return answer;
    }
}
