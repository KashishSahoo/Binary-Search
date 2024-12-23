public class a1_binary{
    public static void main(String[] args) {
        int arr[]={3,4,6,7,9,12,16,17};
        int target=6;
        int ans=binaryRec(arr,target,0,arr.length);
        System.out.println(ans);
    }
    static int binary(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return -1;
    }
    static int binaryRec(int arr[],int target,int low,int high){
        if(low>high){
           return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
             return binaryRec(arr, target,mid+1,high);
        }
        else{
            return binaryRec(arr, target,low,mid-1);
        }
    }


}