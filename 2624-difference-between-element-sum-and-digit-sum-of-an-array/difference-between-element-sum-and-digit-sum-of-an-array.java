class Solution {
    public int digitsum(int n){
        int sum=0;
        while(n > 0){
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int sumdigit=0;    
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sumdigit=sumdigit+digitsum(nums[i]);
            sum=sum+nums[i];
        }


        return Math.abs(sum-sumdigit);
        }
}