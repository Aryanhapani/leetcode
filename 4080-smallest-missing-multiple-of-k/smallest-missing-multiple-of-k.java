class Solution {
    public int missingMultiple(int[] arr, int k) {
        int val=0;
     for (int i=0;i<arr.length+1;i++){
         boolean p=false;
         val=k*(i+1);
         for (int j=0;j<arr.length;j++){
             if(arr[j]==val){
                 p=true;
                 break;
             }
         }
         if(!p){
            return val;
         }

     }
         return k*2;
    }
}