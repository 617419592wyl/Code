import java.util.Stack;

/**
 * Created by Administrator on 2016/11/30.
 */
public class Num19 {
    public boolean isValid(String s) {
        if(s==null)
            return true;

        if(s.length()==1 || s.length()%2==1)
            return false;

        Stack<Character> st = new Stack<Character>();
        int i=0;
        char ch;
        while(i !=s.length())
        {
            ch =s.charAt(i++);

            if(ch == '(' || ch == '['||ch == '{')
                st.push(ch);

            else if(st.isEmpty())
                return false;

            else if((ch == ')' && st.peek()=='(') || (ch == '}' && st.peek()=='{') || (ch == ']' && st.peek()=='['))
                st.pop();

            else
                return false;
        }
        if(!st.isEmpty())
            return false;

        return true;
    }
}
