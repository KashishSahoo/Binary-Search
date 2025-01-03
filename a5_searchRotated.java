public class a5_searchRotated {
    public static void main(String[] args) {
        int arr[] = { 7,8,9,1,2,3,4,5,6 };
        int target = 1;
        int ans = rotated(arr, target);
        System.out.println(ans);
    }

    static int rotated(int arr[], int target) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
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
        return -1;
        
    }
}
