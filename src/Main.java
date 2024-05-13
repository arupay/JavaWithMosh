import java.awt.*;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Primitive Types
       byte myAge = 30;
       byte herAge = myAge;
       int viewCount = 1_000_000;
       long viewCount3Billion = 3_000_000L;
       //You must add an L after a long, or you will get an error
        float price = 10.99F;
        //You must add an F suffix to represent a float (4 bytes)
        char letter = 'A';
        boolean isEligible = true;

        //Reference Types
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        //Pointer class
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        //STRINGS
        String message = "Hello World" + "!!";
        String messageLc = message.toLowerCase();
        String messageUc = message.toUpperCase();
        String messageRep = message.repeat(3);
        System.out.println(message.length());
        System.out.println(messageUc);
        System.out.println(messageRep);
        //ESCAPE SEQUENCES ON STRINGS
        //  \' SINGLE QUOTE, \\BACKSLASH \n NEW LINE \t TAB!

        //ARRAYS IN JAVA
        int[] numberArr = new int[10];
        //we can access numebers in this array using index
        numberArr[0] = 1;
        numberArr[1] = 2;
        numberArr[2] = 3;
        System.out.println( Arrays.toString(numberArr));

        //There is newer syntax to initialize arrays, if we know items ahead of time.
        int[] numbers = {2,3,5,6,1};
        System.out.println(numbers.length);
        //Once we make arrays in JAVA we cannot change their length.  THEIR LENGTH IS FIXED.

        Arrays.sort(numbers);
        //SORTS ARRAY .  Again we see may possible inputs so this method is OVERLOADED

        System.out.println(Arrays.toString(numbers));
        //numberArr[10] = 11; EXCEPTION! (Compilation error).


        //MULTIDIMENSIONAL ARRAY
        int[][] twoDimArr = new int[2][3]; // creates an array with two rows three columns, initiated w/ 0
        int [][] modernTwoDimArr = {{2,3},{2,3}};
     System.out.println(Arrays.deepToString(modernTwoDimArr)); //deepToString to print out!

        //CONSTANTS!
        final float PI = 3.141592653589793f; // Constants are created with the keyword final, and declared in caps.
        // ARITHMETIC EXPRESSIONS IN JAVA
        int resultInt = 10 /3; //3
        double resultDouble = (double)10 / (double)3; //3.3333
        int incrementExample = 1;
        incrementExample++;
        //in prefix (++x), x is incrememented firs then assigned, in post fix (x++), x is assigned, then incrememnted.

        //CASTING (TYPE CONVERSION) in Java

        //IMPLICIT CASTING (Widening)
        short xs = 1; //2 bites
        int ys = xs+ 2; //4 bites
        //This occurs when we convert a smaller data type to a larger data type
        //It occurs when there is NO CHANCE of data loss (from int to double).

        //EXPLICIT CASTING (Narrowing)

     System.out.println(resultDouble);
     System.out.println(incrementExample);
    }
}
