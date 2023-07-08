public class flood{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean vis[][]=new boolean [image.length][image[0].length];
        dfs(image,sr,sc,newColor,vis,image[sr][sc]);
        return image;
    }
    public void dfs(int image[][],int sr,int sc,int newColor,boolean vis[][],int start){
      int m=image.length,n=image[0].length;
        if(sr>=m || sc>=n || sr<0 || sc<0 || vis[sr][sc]==true){
            return;
        }
        if(start==image[sr][sc]){
            vis[sr][sc]=true;
        image[sr][sc]=newColor;
        dfs(image,sr-1,sc,newColor,vis,start) ;
        dfs(image,sr+1,sc,newColor,vis,start) ;
        dfs(image,sr,sc+1,newColor,vis,start) ;
        dfs(image,sr,sc-1,newColor,vis,start) ; 
        }
    }
}