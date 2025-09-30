package Java.OOPS;

public class Car {
    String color ;
    String brand ;
    String model ;

    int speed ;
    int Year;


    public void accelerate(int increment){
        speed += increment;
        System.out.println(speed);
    }

    public void brake(int decrement){
        speed -= decrement;
        System.out.println(speed);
    }
}
