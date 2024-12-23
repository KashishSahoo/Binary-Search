public class a15_smallestDivThresh {
    public static void main(String[] args) {
        int arr[]={1,2,5,9};
        int threshold=6;
        int ans=smallestDiv(arr,threshold);
        System.out.println(ans);
    }
    static int maxInArr(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    static int sumByD(int arr[],int div){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)arr[i]/(double)div);
        }
        return sum;
    }
    static int smallestDiv(int arr[],int th){
        int low=1;
        int high=maxInArr(arr);
        while (low<=high) {
            int mid=(low+high)/2;
            if(sumByD(arr, mid)<=th){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

}
