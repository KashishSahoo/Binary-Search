public class a6_searchRotatedRepeat {
    public static void main(String[] args) {
        int arr[] = { 3,1,2,3,3,3,3 };
        int target = 1;
        boolean ans = rotated(arr, target);
        System.out.println(ans);
    }

    static boolean rotated(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } 
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            //left half sorted
            else if (arr[low]<=arr[mid]) {
                if(arr[low]<=target && target<=arr[mid] ){
                  high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //right half sorted
            else{
                if(arr[mid]<=target && target<=arr[high] ){
                    low=mid+1;
                  }
                  else{
                      high=mid-1;
                  } 
            }
        }
        return false;
        
    }
}

