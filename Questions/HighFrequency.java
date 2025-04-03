package Questions;

import com.sun.security.jgss.GSSUtil;

public class HighFrequency {
    public static char HighFreq ( String Str ){
          int [] Freq = new int[26];

          for ( int  i = 0 ; i < Str.length(); i++){
                char Ch = Str.charAt(i);
                if(Ch >= 'a' && Ch <= 'z'){
                    Freq[Ch - 'a']++;
                }
          }
          int Maxidx = 0;
          for (int i = 0 ; i < 26; i++ ){
              if(Freq[i] > Freq[Maxidx] ){
                  Maxidx = i;
              }
          }

          return ((char)(Maxidx + 97));
    }
    public static void main(String[] args) {
        String Str = "aabbbccccdddddcaaaa";
        System.out.println("The Highest Frequency Letter is : "+HighFreq(Str));

    }
}
