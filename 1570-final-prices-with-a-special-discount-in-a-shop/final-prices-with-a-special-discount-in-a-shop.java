class Solution {
    public int[] finalPrices(int[] arr) {
         int[] arr2=new int[arr.length];



        int k=0;
         for (int i=0;i<arr.length;i++){

             boolean p=true;

             for (int j=i+1;j<arr.length;j++){
                 if (arr[i] >= arr[j]){
                    arr2[k]=arr[i]-arr[j];
                    k++;
                     p=false;
                     break;
                 }
             }

             if (p){
                 arr2[k]=arr[i];
                 k++;
             }

         }

        return arr2;
    }
}