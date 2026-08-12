class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int esum=n*(n+1)/2;

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        int result=esum-sum;

        return result;

    }
}