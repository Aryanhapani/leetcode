class Solution {
    public int differenceOfSums(int n, int m) {

    int notdivsum=0;
     int divsum=0;

     for (int i=1;i<=n;i++) {
         if (i%m==0) {
             divsum+=i;
         }else{
             notdivsum+=i;
         }

        }

     int diff=notdivsum-divsum;

     return diff;
        
    }
}