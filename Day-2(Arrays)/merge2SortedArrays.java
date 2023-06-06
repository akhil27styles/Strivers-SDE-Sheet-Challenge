public class merge2SortedArrays  {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int tail1=m-1,tail2=n-1;
        int len=m+n-1;
        while(tail1>=0 && tail2>=0){
            arr1[len--]=(arr1[tail1]>arr2[tail2])?arr1[tail1--]:arr2[tail2--];
        }
        while(tail2>=0){
            arr1[len--]=arr2[tail2--];
        }
        return arr1;
    }
}

