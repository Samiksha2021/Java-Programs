public class sumOfArray {
    
    public static void main(String[] args){

        int[] arr={1,2,3,5,7};
        System.out.println(sum(arr,0));
        
}
   public static int sum(int arr[],int idx){
         if(idx==arr.length){
            return 0;
         }
         int faith=sum(arr,idx+1);
         faith+=arr[idx];
         return faith;
   }
}
