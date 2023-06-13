
public class maxcon1 {
public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int end=0,start=0;
        int maxlen=0;
        while(end<nums.length){
            if(nums[end]==0){
                start=end+1;
            }
            
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }    
}
