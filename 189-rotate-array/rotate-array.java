class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        int d1=k%n;
        int i=0;
        int j=arr.length-1;

        while (i <= j) {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
            
        }
        

        int l=0;
        int m=d1-1;
        while (l<=m) {
            int t=arr[l];
            arr[l]=arr[m];
            arr[m]=t;
            l++;
            m--;

        }

     

        int a=d1;
        int b=arr.length-1;

        while (a<=b) {
            int t=arr[a];
            arr[a]=arr[b];
            arr[b]=t;
            a++;
            b--;
            
        }
       
    }
}