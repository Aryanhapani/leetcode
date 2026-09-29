class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s1=new Stack<>();
        int[] nge=new int[nums2.length];
        int[] ans=new int[nums1.length];

        s1.push(nums2[nums2.length-1]);
        nge[nums2.length-1]=-1;

        for(int i=nums2.length-2;i>=0;i--){

            while(!s1.isEmpty() && s1.peek() <= nums2[i]){
                s1.pop();
            }

            if(s1.isEmpty()){
                nge[i]=-1;
            }else{
                nge[i]=s1.peek();
            }

            s1.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                        nums1[i]=nge[j];
                       break;
                }
            }
        }

        return nums1;
    }
}