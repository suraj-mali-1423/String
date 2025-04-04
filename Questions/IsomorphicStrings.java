package Questions;

public class IsomorphicStrings {
    public static boolean Isisomorphic( String S , String T){
        char [] a  = new char[128];
        for( int i = 0 ; i < S.length(); i++){
            char ch = S.charAt(i);
            char dh = T.charAt(i);
            int idx = (int)ch;
            if(a[idx] == '\0') a[idx] = dh;
            else {
                if(a[idx] != dh) return false;
            }
        }
        char [] b  = new char[128];
        for( int i = 0 ; i < T.length(); i++){
            char ch = T.charAt(i);
            char dh = S.charAt(i);
            int idx = (int)ch;
            if(b[idx] == '\0') b[idx] = dh;
            else {
                if(b[idx] != dh) return false;
            }
        }

        return true;
        
    }
    public static void main(String[] args) {
        String S = "Moon";
        String T = "feel";
        System.out.println(S +" And "+ T +" Is Isomorphic : "+Isisomorphic(S,T));
    }
}
