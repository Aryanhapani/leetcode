class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }


        int count=0;

        for(int i=0;i<arr.length;i++){
            int first=arr[i];
            int second=arr[i] + diff;
            int third=arr[i] + 2* diff;

            if(set.contains(second) && set.contains(third)){
                count++;
            }
        }

        return count;
        
    }
}