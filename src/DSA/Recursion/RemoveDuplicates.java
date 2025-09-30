package DSA.Recursion;

    public class RemoveDuplicates {
        public static StringBuilder removeDuplicates(String str ,StringBuilder newstr , int i , boolean[] map){
           if(i>str.length()-1){
               return newstr;
           }

           if(map[str.charAt(i)-'a'] == false){
               newstr.append(str.charAt(i));
               map[str.charAt(i)-'a'] = true;

           }
            return removeDuplicates(str,newstr,i+1 , map);
        }

        public static void main(String[] args) {
            StringBuilder newstr = new StringBuilder();
            boolean[] map = new boolean[25];

            System.out.println(removeDuplicates("pankaj", newstr,0,map));
        }
    }
