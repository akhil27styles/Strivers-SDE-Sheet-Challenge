import java.util.ArrayList;
public class pascal {

	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> list, prev = null;
        
        for (int i = 0; i < n; i++) {
            list = new ArrayList<Long>(); 
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || j == i) {
                    list.add(1L);
                } else {
                    long value = prev.get(j - 1) + prev.get(j);
                    list.add(value);
                }
            }
            prev = list;
            ans.add(list);
        }
        return ans;
	}
}
