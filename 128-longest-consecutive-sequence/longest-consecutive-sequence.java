class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        if(nums.length==0){
            return 0;
        }
        int max=1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            int diff=nums[i+1]-nums[i];
            if(diff==1){
                count++;
            }else if(diff==0){
                continue;
            }else{
                count=1;
            }

            if(max<count){
                max=count;
            }
        }

        return max;
    }
}