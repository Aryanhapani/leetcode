class Solution {
    public String decodeMessage(String key, String message) {
        String s = key;
        String msg = message;
        String s1="";
        String s2="abcdefghijklmnopqrstuvwxyz";


        HashSet<Character> hset=new HashSet<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                continue;
            }
            if (!hset.contains(s.charAt(i))){
                hset.add(s.charAt(i));
                s1+=s.charAt(i);

            }
        }
        System.out.println(s1);


        HashMap<Character,Character> map=new HashMap<>();
        for (int i=0;i<s2.length();i++){
            map.put(s1.charAt(i), s2.charAt(i));
        }

        String finalstring="";
        for (int i=0;i<msg.length();i++){
            if (msg.charAt(i)==' '){
                finalstring+=" ";
            }
            if (map.containsKey(msg.charAt(i))){
                finalstring+=map.get(msg.charAt(i));
            }
        }
       

       return finalstring;
        
    }
}