class Solution {
    public int majorityElement(int[] arr) {
        int ele=0;;
        int freq=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(freq==0){
                freq=1;
                ele=arr[i];
            }else if(ele==arr[i]){
                freq++;
            }else{
                freq--;
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(ele==arr[i]){
                count++;
            }
        }

        if(count > (n/2)){
            return ele;
        }
    
    
        return ele;
    }
}