import java.util.ArrayList;
public class Searchin2d {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
           int row=0,col=mat.get(0).size()-1;
           while(row<mat.size() && col>=0){
               if(mat.get(row).get(col)==target){
                   return true;
               }
               else if(mat.get(row).get(col)>target){
                   col--;
               }
               else{
                   row++;
               }
           }
           return false;
    }
}
