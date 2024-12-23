public class a7_minRotatedArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2};
        int ans = rotatedMin(arr);
        System.out.println(ans);
    }

    static int rotatedMin(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        int ans=Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            //search space is already sorted then always arr[low] is will be smaller in that search space in that search space
            if(arr[low]<=arr[high]){
                ans=Math.min(ans,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){
              ans=Math.min(ans,arr[low]);
              low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
        
    } 
}
