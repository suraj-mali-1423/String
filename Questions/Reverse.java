package Questions;

import java.util.Scanner;

public class Reverse {
    public static  void Reverse(StringBuilder Str){
        int i = 0 ;
        int j = Str.length() - 1;



        while( i < j ){
            char temp = Str.charAt(i);
            Str.setCharAt(i , Str.charAt(j));
            Str.setCharAt(j , temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder Str = new StringBuilder(Sc.nextLine());

        Reverse(Str);
        System.out.print(Str);

    }
}
