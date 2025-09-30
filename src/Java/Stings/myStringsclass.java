package Java.Stings;

public class myStringsclass {
    /*public static boolean Ispalindrome(String s){
        int start = 0;
        int end  = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }*/


    public static float GetShortestPath(String str){
        int x =0;
        int y =0    ;
        for (int i =0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;

                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }
        }
        return (float)Math.sqrt((x*x)+(y*y));

    }



    public static void main(String[] args) {
        String s = "ab";
        String S1 = "bc";

        int result = s.compareTo(S1);

        System.out.println(result);
    }
}
