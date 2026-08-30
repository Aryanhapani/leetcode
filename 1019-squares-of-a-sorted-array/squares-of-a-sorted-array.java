class Solution {
    public int[] sortedSquares(int[] arr) {
         int arr2[]=new int[arr.length];

        for (int i=0;i<arr.length;i++){
            int sq=Math.abs(arr[i]);
            arr2[i]=sq*sq;
        }

        Arrays.sort(arr2);
 return arr2;       
}
}