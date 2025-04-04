package Questions;

public class MaximumNumber {

    public static void main(String[] args) {
        String [] Str = { "999" , "1084" , "0078" , "9999"};
        int [] arr = new int[Str.length];

        // Step 1 : Convert the Strign Element to the Array integer
        for(int i = 0 ; i < Str.length ; i++){
            arr[i] = Integer.parseInt(Str[i]);
        }

        // Step 2 : Find the maximum number
        int MaxValue = 0;
        for (int i = 0; i < Str.length; i++) {
               if(arr[i] > MaxValue){
                   MaxValue = arr[i];
               }
        }
        // Step 3 : Conver the Integer to String
        String  Max = String.valueOf(MaxValue);

        System.out.println(Max);
    }
}
