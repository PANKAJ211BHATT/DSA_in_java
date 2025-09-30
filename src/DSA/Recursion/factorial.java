package DSA.Recursion;

public class factorial {
    public static void main(String[] args) {

        System.out.println(PowerofN(4,2));
    }
    public static int factorial1(int n){
        if(n==0|| n==1){
            return 1;
        }
        return n * factorial1(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n + sum(n-1);
    }


    // reverse the String

    public static String ReverseTheString(String s){
        if(s == null || s.length() < 1){
            return s;
        }
        return ReverseTheString(s.substring(1)) + s.charAt(0);
    }

    public static boolean IsSorted(int [] arr , int i){
        if(i == arr.length -1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }

        return IsSorted(arr,i+1);
    }

    public static int FirstOccurance(int [] arr , int i, int key){
        if(i < 0){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }

        return FirstOccurance(arr,i-1 , key);
    }
    public static int LastOccurance(int [] arr , int i, int key){
        if(i == arr.length){
            return -1;
        }
        int lastindex = LastOccurance(arr,i+1,key);
        if(lastindex ==  -1 && arr[i] == key){
            return i;
        }
        return lastindex;
    }
    public static int PowerofN(int n , int p){
        if(p==0){
            return 1;
        }
        return n * PowerofN( n ,p-1);
    }
}
