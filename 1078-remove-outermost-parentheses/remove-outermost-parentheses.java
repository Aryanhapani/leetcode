class Solution {
    public String removeOuterParentheses(String s) {
        String  ans="";
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                if(!stack1.empty()){
                    ans+=s.charAt(i);
                }
                stack1.push(s.charAt(i));
            }

            if(s.charAt(i)==')'){
                stack1.pop();
                if(!stack1.empty()){
                    ans+=s.charAt(i);
                }
            }
        }

  return ans;
}
}