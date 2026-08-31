class Solution {
    public int majorityElement(int[] arr) {
      int n=arr.length;
       Arrays.sort(arr);

       int frq=1;
       int ans=arr[0];
     
       for(int i=1;i<arr.length;i++){
         if(arr[i]==arr[i-1]){
            frq++;

         }else{
            frq=1;
            ans=arr[i];
         }


         if(frq > (n/2)){
            return ans;
         }
       }

       return ans;

    }
}