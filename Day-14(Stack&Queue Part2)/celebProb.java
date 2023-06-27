
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
class Runner{
    public static boolean knows(int a,int b){
        return true; // this will return if knows 
    }
}	
public class celebProb {
	public static int findCelebrity(int n) {
        // Write your code here.
		if(n<=1) return -1;
		int celeb=0;
		for(int i=0;i<n;i++){
			if(i!=celeb &&Runner.knows(celeb,i)) {
				celeb=i;
			}
		}
		for(int i=0;i<n;i++){
			if(celeb!=i && (Runner.knows(celeb,i) || !Runner.knows(i,celeb))){
			   return -1;
			}
		}
		return celeb;
    }
}
