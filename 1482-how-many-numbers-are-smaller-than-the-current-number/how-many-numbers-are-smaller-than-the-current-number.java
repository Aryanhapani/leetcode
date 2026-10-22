class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        HashMap<Integer,Integer> h=new HashMap<>();

        int[] res=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int count=0;

            for(int j=0;j<nums.length;j++){

                if(nums[j] < nums[i]){
                    count++;
                }
            }

            h.put(nums[i],count);
        }

        for(int i=0;i<res.length;i++){
            if(h.containsKey(nums[i])){
                res[i]=h.get(nums[i]);
            }
        }

        return res;
        
    }
}