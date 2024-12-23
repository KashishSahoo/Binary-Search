public class a13_kokoBanana {
    public static void main(String[] args) {
        int plies[]={3,6,7,11};
        int hours=8;
        int minRate=minRateToEatBananas(plies,hours);
        System.out.println(minRate);
    }
    static int findMax(int arr[]){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    static int calTotHours(int arr[],int hourly){
        int totalhrs=0;
        for(int i=0;i<arr.length;i++){
            totalhrs+=Math.ceil((double)arr[i]/(double)hourly);
        }
        return totalhrs;
    }
    static int minRateToEatBananas(int arr[],int hours){
        int low=1;
        int high=findMax(arr);
        while (low<=high) {
            int mid=(low+high)/2;
            int totalhrs=calTotHours(arr, mid);
            if(totalhrs<=hours){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        
        }
        return low;
    }
}
