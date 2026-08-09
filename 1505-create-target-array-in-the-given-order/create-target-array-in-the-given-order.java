class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int curr=index[i];

              //shift element left to right
            for(int j=i;j>curr;j--){
                target[j]=target[j-1];
            }

            target[curr]=nums[i];

        }

        return target;
    }
}