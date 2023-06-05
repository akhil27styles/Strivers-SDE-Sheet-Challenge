public class MajorityElem1 {
    public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int elem=0,count=0;
		for(int i:arr){
			if(count==0){
				elem=i;
				count=1;
			}
			 if(elem==i){
				 count++;
			}
			else {
				 count--;
			}
		}
		count=0;
	for(int i=0; i<n; i++)
        if(elem==arr[i])
            count++;
    return count>n/2 ? elem : -1;
	}    
}
