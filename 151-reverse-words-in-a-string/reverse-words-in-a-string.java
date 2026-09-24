class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");

        StringBuilder s1=new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            s1.append(arr[i]).append(" ");
        }

        s1.setLength(s1.length()-1);


        return s1.toString();
       
    }
}