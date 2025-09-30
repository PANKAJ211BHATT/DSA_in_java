package DSA.StringDSA;

import java.util.Stack;

public class Parenthesis_Checker {
    public static boolean isBalanced(String s) {
        Stack<Character> St = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( ch == '{' || ch == '[' || ch == '(') St.push(ch);
            else if (ch =='}' && !St.isEmpty() && St.peek() == '{') {
                St.pop();
            }
            else if (ch ==']'  && !St.isEmpty() && St.peek() == '[') {
                St.pop();
            }
            else if (ch ==')'  && !St.isEmpty() && St.peek() == '(') {
                St.pop();
            }
            else{
                return false;
            }
        }
        return St.isEmpty();

    }
    public static void main(String[] args) {
        String s = "([(]{})";
        System.out.println(isBalanced(s));
    }
}
