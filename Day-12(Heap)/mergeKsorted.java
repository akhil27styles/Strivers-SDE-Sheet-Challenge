import java.util.* ;
class data{
    int val,arrPos,valPos;
    data(int val,int arrPos,int valPos){
        this.val=val;
        this.arrPos=arrPos;
        this.valPos=valPos;
    }
}
public class mergeKsorted {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
	PriorityQueue<data>p=new  PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for(int i=0;i<k;i++){
            for(int j=0;j<kArrays.get(i).size();j++){
                p.add(new data(kArrays.get(i).get(j),i,j));
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<>();
        while (!p.isEmpty()) {
            data d = p.poll();
            sortedList.add(d.val);
        }

        return sortedList;
	}    
}
