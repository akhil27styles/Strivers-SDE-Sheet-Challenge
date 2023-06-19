import java.util.ArrayList;
public class matrixMedian {
 public static int countSmallerThanMid(ArrayList<Integer> A, int mid, int n) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int md = (l + h) >> 1;
            if (A.get(md) <= mid) {
                l = md + 1;
            } else {
                h = md - 1;
            }
        }
        return l;
    }

    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        int rows = matrix.size();
        int columns = matrix.get(0).size();
        int l = 0, hi = 100000;

        while (l <= hi) {
            int mid = (l + hi) >> 1;
            int count = 0; // Initialize count inside the loop
            for (int i = 0; i < rows; i++) {
                count += countSmallerThanMid(matrix.get(i), mid, columns);
            }
            if (count <= (rows * columns) / 2) {
                l = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return l;
    }    
}
