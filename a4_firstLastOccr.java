public class a4_firstLastOccr {
    //Hare Krishna
    public static void main(String[] args) {
        int arr[] = { 2,8,8,8,8,8,11,11,13};
        int f=first(arr, 80);
        if(f==-1){
            System.out.println("-1 -1");
        }
        int l=last(arr,8);
        System.out.println(f+" "+l);

     
    }

    static int first(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if(arr[mid]>target) {
                high = mid - 1;
            }
            else{
                low=mid+1;
            }

        }

        return ans;
    }
    
    static int last(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low=mid+1;
            } 
            else if(arr[mid]>target) {
                high = mid - 1;
            }
            else{
                low=mid+1;
            }

        }

        return ans;
    }
}
