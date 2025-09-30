package DSA.BITMANUPULATION;

public class evenandOdd {
        static int getIthBit(int n, int k) {
             if((n&(1<<k)) == 0){
                 return 0;
             }
            return 1;
        }

        static int setIthbit(int n, int k) {
            return (n | (1 << k));
        }

        static int clearIthbit(int n, int k) {
            return (n & ~(1 << k));

        }
        static int updateIthbit(int n, int i,int newBit) {
            return (n & ~(1 << i)) | (newBit << i);

        }
        static int clearlastithbits(int n, int i) {
            return n & ((~0)<<i);
        }
        static int clearrangeInbits(int n, int i , int j) {
            int a = (~0) << (j + 1);
            int b = (1 << i) - 1;
            return n & (a|b);
        }
        static boolean PowerOf2OrNot(int n) {
            if(n<0){
                return false;
            }
            return (n & (n - 1)) == 0;
        }

        static int countSetBit(int n) {
            int count = 0;
            while(n!=0){
                count+=(n&1);
                n= n>>1;
            }
            return count;
        }

        public static void main(String[] args) {
            System.out.println(countSetBit(15));

        }
}
