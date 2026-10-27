class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        int k=0;
        int m=heights.length-1;

        while(k < m){
            int temp=heights[k];
            heights[k]=heights[m];
            heights[m]=temp;

            k++;
            m--;
        }

        for(int i=0;i<heights.length;i++){
            if(map.containsKey(heights[i])){
                names[i]=map.get(heights[i]);
            }
        }

        return names;
        
    }
}