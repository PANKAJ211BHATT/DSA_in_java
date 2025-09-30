package DSA.Temp;
class Car{

    // this method first case
    private String Color ;
    private int Speed;

    Car(String color , int speed){
        this.Color = color;
        this.Speed = speed;
    }

    // this 2nd case method call from same class
    public void display(){
        System.out.println("this is a display method");
    }

    public void Show(){
        this.display();
    }

}


//To call current class constructor

class Demo{

    Demo(){
        this(10);
        System.out.println("this print something");
    }

    Demo(int k){
        System.out.println("this print something");
    }
}
public class Main {


    public static void main(String[] args) {
        Car cr = new Car("red",21);


    }
}
