class Solution {
    public int mostFrequentEven(int[] num) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<num.length;i++){
            map.put(num[i],map.getOrDefault(num[i],0)+1);
        }


        int max=0;
        int ans=-1;

        for(int key:map.keySet()){
            int freq=map.get(key);

            if(key % 2==0 && freq > max){
                max=freq;
                ans=key;
            }else if(key % 2==0 && freq==max && key < ans){
                ans=key;
            }
        }
    
    return ans;
      

        
    }
}