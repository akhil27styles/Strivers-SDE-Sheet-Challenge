import java.util.*;
public class validParentthesis {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character>st=new Stack<>();
        for(char c:expression.toCharArray()){
            if(c=='('){
                st.push(')');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(st.isEmpty()||st.pop()!=c){
                return false;
            }
        }
        return st.size()==0;
    }
}