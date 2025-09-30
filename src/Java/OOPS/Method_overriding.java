package Java.OOPS;

class Animal{
    void makesound(){
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    void makesound() {
        System.out.println("Woof! Woof!");
    }
}
class Cat extends Animal{
    @Override
    void makesound() {
        System.out.println("meow.. meow..");
    }
}
class D extends Animal{

}
public class Method_overriding {
    public static void main(String[] args) {
        Animal mydog = new Dog();

        mydog.makesound();

    }
}
