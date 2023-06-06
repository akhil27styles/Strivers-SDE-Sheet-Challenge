import java.util.* ;
class Interval {
    int start;
    int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class mergeInterval {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
      List<Interval>res=new ArrayList<>();
  Arrays.sort(intervals,(a,b)->a.start-b.start);
      Integer st=null;
      Integer en=null;
      for(Interval elem:intervals){
          if(st==null || en==null){
              st=elem.start;
              en=elem.finish;
          }
          if(elem.start<=en){
              en=Math.max(elem.finish,en);
          }
          else{
              res.add(new Interval(st, en));
              st=elem.start;
              en=elem.finish;
          }
      }
       res.add(new Interval(st, en));
       return res;
    }
}
