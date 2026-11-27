class Solution {
    public int minimumSum(int num) {
         

      int number[]=new int[4];
      

        int i=0;
      while (num>0){
          int ld=num%10;
          number[i]=ld;
          i++;
          num=num/10;
      }

      Arrays.sort(number);


        int new1=number[0] * 10 + number[2];
         int new2=number[1] * 10 + number[3];


      
      return new1+new2;
    }
}