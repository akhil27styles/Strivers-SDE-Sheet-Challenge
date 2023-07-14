
public class NoOfIslanddfs {
    public int numIslands(char[][] grid) {
     boolean vis[][]=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
                 if(grid[i][j]=='1'&&!vis[i][j]){
                     help(i,j,vis,grid);
                     c++;
                 }
        }   
        }
        return c;
    }
    
    public void help(int i,int j,boolean vis[][],char grid[][]){
if(i<0||j<0||i>=grid.length||j>=grid[0].length||vis[i][j]==true||grid[i][j]=='0')
            return;
        vis[i][j]=true;
        help(i+1,j,vis,grid);
        help(i,j+1,vis,grid);
        help(i,j-1,vis,grid);
        help(i-1,j,vis,grid);
    }
}