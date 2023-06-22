
public class KthLargestelem {
     public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums,k,0,nums.length-1);
    }
    public int quickSelect(int nums[],int k,int low,int high){
        int pivotPoint=getPivotPoint(nums,low,high);
        if(pivotPoint==nums.length-k) return nums[pivotPoint];
        else if(pivotPoint<nums.length-k){
            return quickSelect(nums,k,pivotPoint+1,high);
        }
             return quickSelect(nums,k,low,pivotPoint-1);
    }
    public int getPivotPoint(int nums[],int low,int high){
        int pivotElement=nums[high];
        int pivotPoint=low;
        for(int i=low;i<=high;i++){
            if(nums[i]<pivotElement){
                swap(nums,i,pivotPoint);
                pivotPoint++;
            }
        }
        swap(nums,pivotPoint,high);
        return pivotPoint;
    }
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
