
public class longestCommonPrefix {
public static String LongestCommonPrefix(String[] arr, int n) {
		// Write your code here
		String s=arr[0];
		 for(int i=1;i<arr.length;i++){
             while(arr[i].indexOf(s)!=0){
				 s=s.substring(0,s.length()-1);
			 }
		 }
		 return s;
	}    
}
