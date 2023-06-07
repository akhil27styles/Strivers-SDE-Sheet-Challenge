public class rotateMatrix {
        public void rotate(int[][] matrix) {
            int n=matrix.length,m=matrix[0].length;
            //transpose
            for(int i=0;i<n;i++){
                for(int j=i;j<m;j++){
                   int t=matrix[i][j];
                   matrix[i][j]=matrix[j][i];
                   matrix[j][i]=t;
                }
            }
            // swapiing
            for(int i=0;i<n;i++){
                for(int j=0;j<m/2;j++){
                    int t= matrix[i][j];
                     matrix[i][j]= matrix[i][m-1-j];
                     matrix[i][m-1-j]=t;
                }
            }
        }
    }
