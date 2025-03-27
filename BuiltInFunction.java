public class BuiltInFunction {
    public static void main(String[] args) {

        String Str = "Suraj";

        // .CharAt( Index Number )
        System.out.println(Str.charAt(1)); // U

         // .length() Grt the sozeof the given string
        System.out.println(Str.length()); // %

        // .indexof( give the char inside )
        System.out.println(Str.indexOf("a"));


        // .Compareof() comparet the two string
        String a = "abcff";
        String b = "abc";
        System.out.println(a.compareTo(b)); // 2

        // .contains() check whether they are present or not
        System.out.println(b.contains("abcd")); // False

        // ..startwith() check they are start with
        System.out.println(a.startsWith("a"));  // true

        System.out.println(a.endsWith("f"));  // true

        // tolowerCase() And toupperCase()
        String st2 = "Sarthak";
        String st3 = "Mali";
        System.out.println(st2.toLowerCase());
        System.out.println(st2.toUpperCase());

        // .concat( give the strig name inside )
        System.out.println(st2.concat(st3));


        // substring(i) and substring(i,j)
        System.out.println(st2.substring(2));
        System.out.println(st2.substring(0,7));
    }
}
