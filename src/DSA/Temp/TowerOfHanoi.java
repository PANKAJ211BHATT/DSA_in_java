package DSA.Temp;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'A'; // Source tower
        char auxiliary = 'B'; // Auxiliary tower
        char destination = 'C'; // Destination tower

        System.out.println("Tower of Hanoi for " + n + " disks:");
        towerOfHanoi(n, source, destination, auxiliary);
    }

    static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from tower " + source + " to tower " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from tower " + source + " to tower " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
