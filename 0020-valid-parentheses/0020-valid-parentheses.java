class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        if(s.length()%2!=0 || s.charAt(0)==']'||s.charAt(0)=='}'||s.charAt(0)==')'){
            return false;
        }
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }
            else if(s.charAt(i)=='['){
                st.push(']');
            }
            else if(s.charAt(i)=='{'){
                st.push('}');
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==st.peek()){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
        }
    return st.isEmpty();   
    }
}