class Solution {
    public static int countsum(int n){
        int count=0;

        while(n>0){
            n=n/10;
            count++;
        }

        return count;
    }
    public int findNumbers(int[] nums) {
        
        int sum;
        int count=0;
        for(int i=0;i<nums.length;i++){
          sum=countsum(nums[i]);
          if(sum%2==0){
            count++;
          }
        }

        return count;
    }
}