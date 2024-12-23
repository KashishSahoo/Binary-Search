public class a8_noOfTimesRotated {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};//0 1 2 3 4 
        int ans = rotatedMin(arr);
        System.out.println(ans);
    }

    static int rotatedMin(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        int ans=Integer.MAX_VALUE;
        int idx=-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            //search space is already sorted then always arr[low] is will be smaller in that search space in that search space
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    idx=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    idx=low;
                    ans=arr[low];
                }
              low=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    idx=mid;
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }
        return idx;
        
    } 
}

