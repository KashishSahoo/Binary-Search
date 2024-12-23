public class a12_nthRoot {
   public static void main(String[] args) {
    int n=3;
    int m=27;
    int ans=nRoot(n,m);
    System.out.println(ans);
   } 
   
   
   static int power(int mid,int n,int m)
   {
      //to handle ,mid^n do not overflow ,we check the moment it crosses m stop
       long ans=1;
       for(int i=1;i<=n;i++){
         ans=ans*mid;
         if(ans>m) return 2;
       }
       if(ans==m) return 1;
       return 0;


   }
   static int nRoot(int n,int m){
      int low=1;
      int high=m;
      while (low<=high) {
         int mid=(low+high)/2;
         if(power(mid, n, m)==1){
            return mid;
         }
         else if(power(mid, n, m)==0){
               low=mid+1;
         }
         else{
            high=mid-1;
         }
      }
      return -1;
   }
}
