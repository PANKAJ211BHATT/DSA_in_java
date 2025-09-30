package Java.OOPS;

import org.w3c.dom.ls.LSOutput;

class A{
    int a = 5;
}
class B extends A{
    int b=2;
    void disply(){
        System.out.println(super.a);
    }
}
class C extends B{
    int b=2;
    void disply(){
        System.out.println(a);
    }
}

public class inhanritance {

    public static void main(String[] args) {
        C C = new C();
        C.disply();
    }
}
