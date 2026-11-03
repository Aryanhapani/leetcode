class Solution {
    public int totalMoney(int n) {
        int lastmoday=0;
        int currmoday=0;
        int total=0;

        for(int i=1;i<=n;i++){

            if(i%7==1){
                lastmoday=lastmoday+1;
                total=total+lastmoday;
                currmoday=lastmoday;
            }else{
            currmoday=currmoday+1;
            total+=currmoday;

            }

            
        }

        return total;
    }
}