class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;
        int i = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                i = mid;
                end = mid - 1;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        start = 0 ;
        end = nums.length-1;
        int j = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                j = mid;
                start = mid + 1;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return new int [] {i,j};
    }
}