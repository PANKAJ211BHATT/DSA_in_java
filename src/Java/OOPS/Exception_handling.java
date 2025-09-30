package Java.OOPS;

public class Exception_handling {
    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("here we have error!!");
        }
        System.out.println("flow is fine");
    }
}
