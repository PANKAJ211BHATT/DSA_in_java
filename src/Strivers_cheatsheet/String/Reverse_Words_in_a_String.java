package Strivers_cheatsheet.String;

public class Reverse_Words_in_a_String {
    static private String result(String s){
        int left  =0;
        int right = s.length()-1;

        String temp = "";
        String ans = "";

        while (left <= right){
            char ch = s.charAt(left);
            if (ch != ' ')
            {
                temp += ch;
            } else if (ch == ' ') {
                if (!ans.equals("")){
                    ans = temp+" "+ans;
                }else{
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }
        if (!temp.equals(""))
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String st = "TUF is great for interview preparation       ";
        System.out.println("Before reversing words: ");
        System.out.println(st);
        System.out.println("After reversing words: ");
        System.out.print(result(st));
    }
}
