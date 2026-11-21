class Solution {
    public int countDigits(int num) {
         int n2=num;

       int count=0;
       while (num>0) {
           int ld=num%10;
           if (n2%ld==0){
               count++;
           }
           num=num/10;
       }

       return count;
    }
}