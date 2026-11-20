class Solution {
    public boolean checkPerfectNumber(int num) {

        if(num <= 1){
            return false;
        }
         int sum=1;
      for(int k=2;k<=Math.sqrt(num);k++) {
          if (num%k==0){
             sum+=k;


             if(k != num/k){
                sum+=num/k;
             }
          }
      }

      if(num==sum){
        return true;
      }

      return false;
    }
}