package Questions;

public class MaxStringDigit {
    public static  String Purify(String s ){
          for( int i = 0 ; i < s.length() ; i++){
              if(s.charAt(i) != '0') return s.substring(i);
          }
          return s;
    }

    public static String max( String a , String b){
          String s = Purify(a) , t = Purify(b);
          if(s.length() > t.length()) return a;
          if(s.length() < t.length()) return b;
          for( int i = 0 ; i < s.length(); i++){
              if(s.charAt(i) != t.charAt(i)){
                  if(s.charAt(i) > t.charAt(i)) return a;
                  else return b;
              }
          }

          if(a.length() >= b.length()) return a;
          else return b;
    }
    public static void main(String[] args) {
          String [] arr = {"100" , "999","998" , "0087" , "0007" , "1111"};

          String MaxS = arr[0];
          for( int i = 0 ; i < arr.length; i++){
              MaxS = max(arr[i] , MaxS);
          }
        System.out.println(MaxS);
    }
}
