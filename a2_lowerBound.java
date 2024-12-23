public class a2_lowerBound {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 15, 19 };
        int target = 9;
        int ans = lower(arr, target);
        System.out.println(ans);
    }

    static int lower(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans;
    }
    static int upper(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans;
    }

}