public class nextPermutationclass {
        public void nextPermutation(int[] nums) {
            if(nums.length<=1 || nums==null) return ;
            int i=nums.length-2;
            while(i>=0&&nums[i]>=nums[i+1]) i--;
            if(i>=0){
                int j=nums.length-1;
                while(nums[j]<=nums[i])
                {
                    j--;
                }
                swap(nums,i,j);
            }
            reverse(nums,i+1);
        }
        public void swap(int a[],int i,int j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        public void reverse(int a[],int start){
            int i = start, j = a.length - 1;
            while (i < j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
}
