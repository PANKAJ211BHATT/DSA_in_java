package Java.OOPS;

class myThread extends Thread{
    public void run(){
        System.out.println("hello world!");
    }

}
public class Multithreading {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }
}
