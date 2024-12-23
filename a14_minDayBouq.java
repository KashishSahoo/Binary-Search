public class a14_minDayBouq {
    public static void main(String[] args) {
        int arr[]={7,7,7,7,13,11,12,7};
        int m=2;
        int k=3;
        int ans=minDay(arr,m,k);
        System.out.println(ans);

    }
    static boolean possible(int arr[],int day,int m,int k){
        int cnt=0;
        int noOfB=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                noOfB+=(cnt/k);
                cnt=0;
            }
        }
        noOfB+=(cnt/k);
        if(noOfB>=m){
            return true;
        }
        else {
            return false;
        }
    }
    static int maxInArr(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    static int minInArr(int arr[]){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            mini=Math.min(mini,arr[i]);
        }
        return mini;
    }
    static int minDay(int arr[],int m,int k){
        int low=minInArr(arr);
        int high=maxInArr(arr);
        while (low<=high) {
            int mid=(low+high)/2;
            if(possible(arr, mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
