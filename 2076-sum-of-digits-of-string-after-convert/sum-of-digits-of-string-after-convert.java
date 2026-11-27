class Solution {
      public static int onek(int finalvalue){
        int sum = 0;
        while (finalvalue > 0){
          int ld = finalvalue % 10;
          sum += ld;
          finalvalue /= 10;
        }

        return sum;
    }
    public int getLucky(String s, int k) {
        k=k-1;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',6);
        map.put('g',7);
        map.put('h',8);
        map.put('i',9);
        map.put('j',10);
        map.put('k',11);
        map.put('l',12);
        map.put('m',13);
        map.put('n',14);
        map.put('o',15);
        map.put('p',16);
        map.put('q',17);
        map.put('r',18);
        map.put('s',19);
        map.put('t',20);
        map.put('u',21);
        map.put('v',22);
        map.put('w',23);
        map.put('x',24);
        map.put('y',25);
        map.put('z',26);


        String digit="";
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                System.out.println(map.get(s.charAt(i)));
                digit=digit+map.get(s.charAt(i));
            }
        }


       int finalsum=0;
        for (int i = 0; i < digit.length(); i++) {
            char ch=digit.charAt(i);

            finalsum+= ch-'0';

        }




        int sum=0;
        while (k >= 1){
            sum=onek(finalsum);
            finalsum=sum;
            k--;

        }
        return finalsum;
    }
}