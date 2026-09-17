class Solution {
    public void reverseString(char[] arr) {
        int left=0;
        int right=arr.length-1;

        while(left < right){
            char t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;

            left++;
            right--;
        }


    }
}