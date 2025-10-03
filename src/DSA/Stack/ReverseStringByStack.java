package DSA.Stack;

import java.util.Stack;

public class ReverseStringByStack {
    public static StringBuilder ReverseString(String str){
        Stack<Character> s = new Stack<>();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            s.push(str.charAt(i));
        }
        
        while(!s.isEmpty()){
            str2.append(s.pop());
        }
        return str2;
    }

    public static void main(String[] args) {
        String str = "helloWorld";
        System.out.println(ReverseString(str));
    }
}
