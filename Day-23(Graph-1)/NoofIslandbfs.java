import java.util.*;
public class NoofIslandbfs {
    
     static  int[][] direction = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
    public int numIslands(char[][] grid) {
         if (grid == null || grid.length == 0) {
             return 0;
                }
         int n = grid.length;
         int m = grid[0].length;
         boolean[][] marked = new boolean[n][m];
       
         int islandCount = 0;
          for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
              if(!marked[i][j] && grid[i][j]=='1'){
                  islandCount++;
                  bfs(i,j,marked,grid);
              }    
            }
        }
        return islandCount;
    }
      public static void bfs(int i,int j,boolean marked[][],char grid[][]){
        int n = grid.length;
        int m = grid[0].length;
       Queue<int[]>q=new LinkedList<>();
       q.offer(new int[]{i,j});
        marked[i][j]=true;
       while(!q.isEmpty()){
           int a[]=q.poll();
           for(int dir[]:direction){
               int x=dir[0]+a[0];
               int y=dir[1]+a[1];
               if(x>=0 && x<n && y>=0 && y<m){
                     if(!marked[x][y] && grid[x][y]=='1'){
                         q.offer(new int[]{x,y});
                         marked[x][y]=true;
                     }
               }
           }
       }

    }
}