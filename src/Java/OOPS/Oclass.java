package Java.OOPS;

public class Oclass {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 3;
        car.color = "red";
        car.brand = "BMW";
        car.model = "f5";
        car.Year = 2020;

        car.accelerate(20);
        car.accelerate(20);
        car.brake(10);
        car.accelerate(20);
    }
}
