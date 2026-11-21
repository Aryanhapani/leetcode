class Solution {
     public static int sumfunction(int n){
        int sum=0;
        while (n>0){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }
        return sum;
    }
    public int countEven(int num) {
        int count=0;
    for(int i=1;i<=num;i++){
        int digit=sumfunction(i);
        if (digit%2==0){
            count++;
        }
    }

    return count;
    }
}