package Questions;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

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
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the String Here : ");
        String Str = Sc.nextLine();
        System.out.println("The Highest Frequency Letter is : "+HighFreq(Str));

        Sc.close();
    }
}
