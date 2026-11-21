class Solution {
    public int alternateDigitSum(int n) {
           ArrayList<Integer> list = new ArrayList<>();
        
        while (n>0) {
            list.add(n%10);
            n=n/10;
        }
        System.out.println(list);

        int sum=0;

        int count=1;
        for (int i= list.size()-1;i>=0;i--) {
            if (count%2==0) {
                sum-=list.get(i);
            }else{
                sum+=list.get(i);
            }
            count++;
        }
        return sum;
    }
}