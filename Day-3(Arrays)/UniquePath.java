public class UniquePath {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int N=m+n-2;
		int r=m-1;
		double ans=1;
		for(int i=1;i<=r;i++){
			ans=ans*(N-r+i)/i;
		}
		return (int)ans;
	}    
}
// suppose m=2 and m=3
// R R D
// D R R
// R D R
// m-1 + n-1 =m+n-2
