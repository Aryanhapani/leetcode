class Solution {
        public static  int productofnumber(int n){
        int product=1;
        while (n >0){
            int ld=n%10;
            product*=ld;
            n=n/10;
        }

        return product;
    }
    public  static  int sum0fnumber(int n){
        int sum=0;
        while (n>0){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }

        return sum;
    }

    public boolean checkDivisibility(int n) {
       int n1=n;
       int ans1=sum0fnumber(n1);
        
       int n2=n;
       int ans2=productofnumber(n2);
        
       if(n%(ans1+ans2)==0){
           return true;
       }

        return false;
    }
}