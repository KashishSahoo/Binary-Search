public class a16_minCapacityShip {
    public static void main(String[] args) {
        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        int ans = minCapacity(weights, days);
        System.out.println(ans);
    }

    static int maxInArr(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    static int sumInArr(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int findDays(int wts[], int cap) {
        int load = 0;
        int days = 1;
        int n = wts.length;
        for (int i = 0; i < n; i++) {
            if (load + wts[i] > cap) {
                days += 1;
                load = wts[i];

            } else {
                load += wts[i];
            }
        }
        return days;
    }

    static int minCapacity(int wts[], int days) {
        int low = maxInArr(wts);
        int high = sumInArr(wts);
        while (low <= high) {
            int mid = (low + high) / 2;
            int daysTaken = findDays(wts, mid);
            if (daysTaken <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
