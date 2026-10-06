class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();
        int n=tickets.length;

        for(int i=0;i<tickets.length;i++){
            q.add(tickets[i]);
        }


        int count=0;

        while(!q.isEmpty()){
            int ticket=q.poll();

            if(k==0 && ticket==1){
                count++;
                break;
            }else if(k==0 && ticket > 1){
                q.add(--ticket);
                k=n-1;
                count++;
            }else{
                if(ticket==1){
                    count++;
                    k--;
                    n=n-1;
                }else{
                    q.add(--ticket);
                    k--;
                    count++;
                }
            }

        }

            return count;
        


      

    
    }
}