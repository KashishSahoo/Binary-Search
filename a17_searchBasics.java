class searchBasics{
    public static void main(String args[]){
        int arr[]={3,4,6,7,9,12,16,17};
        int target=7;
        int ans=binaryRec(arr,0,arr.length-1,target);
        System.out.println(ans);
    }
    static int binary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binaryRec(int arr[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
           return mid;
        }
        else if(arr[mid]>target){
           return binaryRec(arr, start, mid-1, target);
        }
       return binaryRec(arr, mid+1,end, target);

    }
}