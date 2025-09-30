package Java.OOPS;
class Calculator{
    int add(int a , int b) {
        return a+b;
    }



    int add(int a,int b , int c ) {
        return a+b+c;
    }


    double add(double a , double b ){

        return a+b;
    }
}
public class Method_overloading {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(2, 3);        // Calls Method 1
        calc.add(2, 3, 4);     // Calls Method 2
        calc.add(2.5, 3.5);    // Calls Method 3
    }
}
