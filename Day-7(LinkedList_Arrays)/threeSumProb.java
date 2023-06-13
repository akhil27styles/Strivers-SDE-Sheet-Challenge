import java.util.*;
public class threeSumProb {
    public List<List<Integer>> threesum(int[] nums,int target) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
        int n=nums.length;
        for(int i=0;i<nums.length-2;i++){
           if (i == 0 || nums[i] != nums[i - 1]) {
            int lo=i+1;
            int hi=n-1;
            while(lo<hi){
             int sum=nums[i]+nums[lo]+nums[hi];
             if(sum==target){
            ArrayList<Integer> a=new ArrayList<Integer>();
              a.add(nums[i]);
			  a.add(nums[lo]);
			  a.add(nums[hi]);
			  ans.add(a);
              while(lo<hi && nums[lo]==nums[lo+1]) lo++;
              while(lo<hi && nums[hi]==nums[hi-1]) hi--;
              lo++;
              hi--;
             }
             else if(sum>target) lo++;
             else hi--;
            }
        }
        }
        return null;
    
    }
}
