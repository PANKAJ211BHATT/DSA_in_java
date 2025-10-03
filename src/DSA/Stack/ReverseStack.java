package DSA.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
       int current =  s.pop();
       reverseStack(s);
        insertAtBottom(s,current);
       
    }
    public static void insertAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            
        } else {
            int temp = s.pop();
            insertAtBottom(s, data);
            s.push(temp);
        }
        
    }
    public static void printStack(Stack<Integer> s){
        Stack<Integer> temp = new Stack<>();
        while(!s.isEmpty()){
            int data = s.pop();
            System.out.println(data);
            temp.push(data);
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(73);
        s.push(31);
        
        printStack(s);
        reverseStack(s);
        printStack(s);
    }
}
