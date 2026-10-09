class Solution {
    public int minAddToMakeValid(String s) {

    Stack<Character> sq=new Stack<>();

    for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);

         if(!sq.isEmpty() && sq.peek()=='(' && ch==')'){
            sq.pop();
         }else{
            sq.push(ch);
         }
    }

    int count=0;
    for(int i=0;i<sq.size();i++){
         count++;
    }

        return count;
    }
}