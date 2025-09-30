package Java.OOPS;

class  Outer {
    int x = 10;

    // Inner class
    static class Inner {
        void display() {
     // can access outer class variable
        }
    }
}
public class innerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(); // creating inner object
        inner.display();  // Output: x = 10
    }

}
