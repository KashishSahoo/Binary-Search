public class a3_floorOfNo {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 25;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return ans;
    }
}
