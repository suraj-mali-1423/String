package Questions;

import java.util.Arrays;

public class Anagram {
    public static boolean CheckAnagram(String s , String t ){
          if(s.length() != t.length()) return falsGiven two strings s and t, return true if t is an anagram of s, and false otherwise.



                Example 1:

        Input: s = "anagram", t = "nagaram"

        Output: true

        Example 2:

        Input: s = "rat", t = "car"

        Output: falsee;

          char [] S1 = s.toCharArray();
          char [] T1 = t.toCharArray();

        Arrays.sort(S1);
        Arrays.sort(T1);
          for ( int i = 0 ; i < s.length(); i++ ){
              if(S1[i] != T1[i]) return false;
          }

          return true;
    }
    public static void main(String[] args) {
        String s = "Suraj";
        String t = "jarus";
        System.out.println(CheckAnagram(s,t));
    }
}
