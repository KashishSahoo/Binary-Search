public class a11_sqrtOfN {
    public static void main(String[] args) {
        int n=25;
        int ans=sqrt(n);
        System.out.println(ans);
    }
    static int sqrt(int n){
        int low=1;
        int high=n;
        int ans=1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
        // return high;
    }
}
