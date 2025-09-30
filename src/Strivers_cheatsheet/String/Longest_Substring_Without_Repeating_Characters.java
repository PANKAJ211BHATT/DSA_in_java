package Strivers_cheatsheet.String;

public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        String str = "";
        for( int i = 0; i <s.length();i++){
           char ch =  s.charAt(i);
           if(str.indexOf(ch) != -1){
               str = str.substring(str.indexOf(ch)+1);
           }
            str +=ch;
            maxlength = Math.max(maxlength, str.length());
        }
        return maxlength;
    }

    public static void main(String[] args) {


        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";

        System.out.println("Input: " + s1 + " → Output: " + lengthOfLongestSubstring(s1));
        System.out.println("Input: " + s2 + " → Output: " + lengthOfLongestSubstring(s2));
        System.out.println("Input: " + s3 + " → Output: " + lengthOfLongestSubstring(s3));
        System.out.println("Input: " + s4 + " → Output: " + lengthOfLongestSubstring(s4));
    }
}
