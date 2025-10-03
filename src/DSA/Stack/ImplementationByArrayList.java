package DSA.Stack;

import java.util.ArrayList;

public class ImplementationByArrayList {
    static class stack{
        ArrayList<Integer> list = new ArrayList<>();
        
        //isEmpty method

        public Boolean isEmpty(){
            return list.size() == 0;
            
        }
        //push
        public void push(int data){
            list.add(data);
        }
        
        //pop
        public int pop(){
            if(this.isEmpty()){
                System.out.println("stack is empty");
            }
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        
        //peek
        public int peek(){
            if(this.isEmpty()){
                System.out.println("stack is empty");
            }
            return list.get(list.size()-1);
             
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(4);
        s.push(7);
        s.push(78);
        s.push(6);
        s.push(5);
        s.push(499);
        

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
       
    }
}
