class Solution {
    public static int product(int n){
        int product=1;
        while (n > 0) {
            int ld=n%10;
            product*=ld;
            n=n/10;
        }

        return product;
    }
    public static int sum(int n){
        int sum=0;
        while (n >  0) {
         int ld=n%10;
         sum+=ld;
         n=n/10;
            
        }

        return sum;
    }
    public int subtractProductAndSum(int n) {

       int resultsum= sum(n);

       int resultproduct=product(n);
      
       int finalresult=resultproduct-resultsum;
       

       return finalresult;
        
    }
}