public class PrintAllSubstring {
    public static void main(String[] args) {
        String Str = "ABCD";
        for( int i = 0 ; i <= Str.length() ; i++ ){
            for( int j = i ; j <= Str.length(); j++){
                System.out.print(Str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
