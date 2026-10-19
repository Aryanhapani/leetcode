class Solution {
    public void duplicateZeros(int[] arr) {

          Queue<Integer> q=new LinkedList<>();

        for (int i=0;i<arr.length;i++) {

            q.add(arr[i]);

            if (arr[i]==0 && q.size() < arr.length){
                q.add(0);
            }

           if (arr.length==q.size()){
               break;
           }
        }

        int i=0;
       while (!q.isEmpty()){
           arr[i]=q.poll();
           i++;
       }
        
        
    }
}