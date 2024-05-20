import java.awt.*;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Primitive Types
//        byte myAge = 30;
//        byte herAge = myAge;
//        int viewCount = 1_000_000;
//        long viewCount3Billion = 3_000_000L;
//        //You must add an L after a long, or you will get an error
//        float price = 10.99F;
//        //You must add an F suffix to represent a float (4 bytes)
//        char letter = 'A';
//        boolean isEligible = true;
//
//        //Reference Types
//        Date now = new Date();
//        now.getTime();
//        System.out.println(now);
//
//        //Pointer class
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//
//        //STRINGS
//        String message = "Hello World" + "!!";
//        String messageLc = message.toLowerCase();
//        String messageUc = message.toUpperCase();
//        String messageRep = message.repeat(3);
//        System.out.println(message.length());
//        System.out.println(messageUc);
//        System.out.println(messageRep);
//        //ESCAPE SEQUENCES ON STRINGS
//        //  \' SINGLE QUOTE, \\BACKSLASH \n NEW LINE \t TAB!
//
//        //ARRAYS IN JAVA
//        int[] numberArr = new int[10];
//        //we can access numebers in this array using index
//        numberArr[0] = 1;
//        numberArr[1] = 2;
//        numberArr[2] = 3;
//        System.out.println(Arrays.toString(numberArr));
//
//        //There is newer syntax to initialize arrays, if we know items ahead of time.
//        int[] numbers = {2, 3, 5, 6, 1};
//        System.out.println(numbers.length);
//        //Once we make arrays in JAVA we cannot change their length.  THEIR LENGTH IS FIXED.
//
//        Arrays.sort(numbers);
//        //SORTS ARRAY .  Again we see may possible inputs so this method is OVERLOADED
//
//        System.out.println(Arrays.toString(numbers));
//        //numberArr[10] = 11; EXCEPTION! (Compilation error).
//
//
//        //MULTIDIMENSIONAL ARRAY
//        int[][] twoDimArr = new int[2][3]; // creates an array with two rows three columns, initiated w/ 0
//        int[][] modernTwoDimArr = {{2, 3}, {2, 3}};
//        System.out.println(Arrays.deepToString(modernTwoDimArr)); //deepToString to print out!
//
//        //CONSTANTS!
//        final float PI = 3.141592653589793f; // Constants are created with the keyword final, and declared in caps.
//        // ARITHMETIC EXPRESSIONS IN JAVA
//        int resultInt = 10 / 3; //3
//        double resultDouble = (double) 10 / (double) 3; //3.3333
//        int incrementExample = 1;
//        incrementExample++;
//        //in prefix (++x), x is incrememented firs then assigned, in post fix (x++), x is assigned, then incrememnted.
//
//        //CASTING (TYPE CONVERSION) in Java
//
//        //IMPLICIT CASTING (Widening)
//        short xs = 1; //2 bites
//        int ys = xs + 2; //4 bites
//        //This occurs when we convert a smaller data type to a larger data type
//        //It occurs when there is NO CHANCE of data loss (from int to double).
//
//        //EXPLICIT CASTING (Narrowing)
//        double xCast = 1.1;
//        int yCast = (int) xCast + 2;  //we are going from a type of more precision (double)
//        //to a type of less precision (int) --> so we must explicitly cast this.
//        //This can ONLY happen with COMPATIBLE TYPES
//        System.out.println(resultDouble);
//        System.out.println(incrementExample);
//
//        //Casting a STRING to a NUMBER? Possible?
//        /*For all primitive types we have wrapper classes, for ints it is INTEGER. See below example*/
//        String X3 = "1";
//        int y = Integer.parseInt(X3);
//        String X4 = "2";
//        float yx = Float.parseFloat(X4);
//
//        //The MATH class
//
//        int result = Math.round(1.1F);
//        int result2 = Math.max (1,2);
//        double resultRandom = Math.random();
//        System.out.println(resultRandom);
//
//        //Formatting Numbers
//        String resultStr = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(resultStr);
//
//
//        //I/O Functions
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name: ");
//        String name = scanner.nextLine();
//        System.out.println("you are " + name);

        //Calculator Project

        /*Requirements:
        * Principal: 100000
        * Annual Interest Rate: 3.92
        * Period (years) : 30
        * Mortgage = P * r(1+r) ^n /  (1+r)^n - 1;
        * */

//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        int principal, years;
//        float interestRate;
//
//        Scanner loanPrompt = new Scanner(System.in);
//        System.out.println("What is your loan amount ?");
//        principal = loanPrompt.nextInt();
//        System.out.println("What is your annual interest rate?");
//        interestRate = loanPrompt.nextFloat();
//        System.out.println("How many years do you need?");
//        years = loanPrompt.nextInt();
//
//        float monthlyInterest = (interestRate / PERCENT) / MONTHS_IN_YEAR;
//        int totalNumberOfMonths = years * MONTHS_IN_YEAR;
//        System.out.println(totalNumberOfMonths);
//
//        double upperEquation = monthlyInterest * Math.pow((1 + monthlyInterest), totalNumberOfMonths);
//        double lowerEquation = Math.pow(1+monthlyInterest, totalNumberOfMonths) -1;
//
//        double mortgagePayment = principal * (upperEquation/ lowerEquation);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment);
//        System.out.println("Mortgage:" + mortgageFormatted);

        //END OF MORTGAGE PROJECT

        //CONTROL FLOW

//         int xNew= 1;
//         int yNew = 1;
//
//        System.out.println(xNew==yNew);
//
//        int temperature =33;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
//
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = false;
//        boolean isEligible = hasHighIncome || hasGoodCredit;
//
//        System.out.println(isEligible);
//
//        int income = 120_000;
//        String className =    income > 100_000 ? "FIRST" :"ECONOMY";
//
        //SWITCH STATEMENTS

//        String roleVar = "Mosh";
//
//        switch (roleVar) {
//            case "admin":
//                System.out.println("You are an admin");
//                break;
//
//            case "user":
//                System.out.println("You are a user");
//                break;
//            default:
//                System.out.println("You are a guest");
//        }

        //FIZZBUZZ EXERCISE LEETCODE
//        class Solution {
//            public List<String> fizzBuzz(int n) {
//                ArrayList<String> fizzBuzzArr= new ArrayList<String>();
//                final String FIZZ = "Fizz";
//                final String BUZZ = "Buzz";
//                final String FIZZBUZZ = "FizzBuzz";
//                for (int x=1; x<=n; x++){
//                    if (x % 3 == 0 && x % 5 ==0){
//                        fizzBuzzArr.add(FIZZBUZZ);
//                    } else if (x%5==0){
//                        fizzBuzzArr.add(BUZZ);
//                    } else if (x%3==0){
//                        fizzBuzzArr.add(FIZZ);
//                    } else {
//                        fizzBuzzArr.add(Integer.toString(x));
//                    }
//                }
//                return fizzBuzzArr;
//            }
//        }

        //LOOPS While

//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!input.equals("quit")){
//            //MUST USE equals instead of !=, because strings are REFERENCE TYPES and
//            //!= will compare the addresses of REFERENCE TYPES not their value.
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }
//        //DO WHILE LOOP (Gets exectured at least ONCE)
//
//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));

        //FOR EACH LOOP

        String[] fruitArr = {"Apple", "Mango", "Orange"};

//        for (int i=0; i < fruitArr.length; i++){
//            System.out.println(fruitArr[i]);
//        }

        for (String fruit : fruitArr){  // FOR EACH LOOP SYNTAX
            System.out.println(fruit);
        }
    }
}
