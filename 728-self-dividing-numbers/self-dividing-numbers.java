class Solution {
    public static int selfdiv(int n){
        int n2=n;

        while(n > 0){
            int ld=n%10;
           if (ld==0 || n2 % ld != 0) {
                return -1;
            }

            n=n/10;
        }

        return n2;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {

      List<Integer> list = new ArrayList<>();

        for(int i=left;i<=right;i++){
        int ans=selfdiv(i);
          if (ans != -1) {
            list.add(ans);
          }
           
        }

        return list;
        
    }
}