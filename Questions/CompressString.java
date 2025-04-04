package Questions;

public class CompressString {
    public static  void Display(char [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("'"+arr[i]+"'");
        }
        System.out.println();
    }
    public static int Compress(char [] arr ){
        int i = 0 , j = 0 , n = arr.length;
        String Ans = "";

        while( j < n ){
            if(arr[i] == arr[j]) j++;
            else{
                Ans += arr[i];
                int len = (j-i);
                if(len > 1) Ans += len;
                i = j;
            }
        }
        Ans += arr[i];
        int len = (j-i);
        if(len > 1) Ans += len;

        for( int k = 0 ; k < Ans.length(); k++){
            arr[k] = Ans.charAt(k);
        }
        Display(arr);
        return Ans.length();
    }
    public static void main(String[] args) {
        char [] arr = {'a' , 'a' , 'b' , 'b' , 'c' , 'c' ,'c'};
        System.out.println(Compress(arr));
    }
}
