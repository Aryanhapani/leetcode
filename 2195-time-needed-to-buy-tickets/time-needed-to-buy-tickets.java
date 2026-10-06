class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();


        for(int i=0;i<tickets.length;i++){
            q.add(new int[]{i,tickets[i]});
        }


        int count=0;


        while(true){


            if(q.peek()[1] > 0){
                int[] frontelement=q.poll();

                frontelement[1]=frontelement[1]-1;

                count++;

                if(frontelement[1]==0 && frontelement[0]==k){
                    break;
                }


                if(frontelement[1] > 0){
                    q.add(frontelement);
                }


            }
        }

        return count;
    }
}