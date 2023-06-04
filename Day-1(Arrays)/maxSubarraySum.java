public class maxSubarraySum {
	public static long maxSubarray(int[] arr, int n) {
		// write your code here
		long sum=0,max=Long.MIN_VALUE;
		for(int i=0;i<n;i++){
           sum+=arr[i];
		   if(sum<0) sum=0;
		   max=Math.max(sum,max);
		}
		return max;
	}
}
