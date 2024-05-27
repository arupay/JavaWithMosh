import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class SecondMain {
    public static void main(String[] args) {
//        System.out.println("Second main is running");
//        String name = "AUGUSTO";
//        int age = 34;
//        hello(name, age);

//        int x = 3;
//        int y = 4;
//        int sumOfTwo = sumTwoNums(x,y);
//        System.out.println(sumOfTwo);


        //overloaded methods, methods that share same name but have different parameters
        //method name + parameters = method signature


//        int sum = add(5,4);
//        double doubleSum = add(3.0, 4.0);
//        System.out.println(sum);
//        System.out.println(doubleSum);


        //PRINT F METHOD  Optical Method to Control format and control text to console window.
//        boolean myBool = true;
//        char myChar = '@';
//        String myStr = "Bro";
//        int myInt = 50;
//        double myDouble = 1000;

//        System.out.printf("%d This is a format string ", 123);
        //takes a format specifier, and a value to display depending on the specifier and combination.
//        System.out.printf("%b ", myBool);
//        System.out.printf("%c ", myChar);
//        System.out.printf("%d ", myInt);
//        System.out.printf("%f ", myDouble);
//        System.out.printf("%s", myStr);

//        System.out.printf(" %-10.2f", myDouble);

//            DiceRoller newDiceRoller = new DiceRoller();


//        Pizza pizzaOne = new Pizza("thick crust", "tomato", "mozzarella","pepperoni" );
//        Pizza pizzaTwo = new Pizza("thick crust", "tomato", "mozzarella" );
//        Pizza pizzaThree = new Pizza("thick crust", "tomato");

        //TO STRING () = special method that all objects in here
        //               returns a string that textually represents an object, used implicitly or explicitly.
//        Car car2 = new Car();

//        System.out.println(car2); //WE HAVE OVERIDDEN THE TO STRING METHOD, SO THE IMPLICIT CALL WILL CALL OUR METHOD!

//        int[] numArr = new int[3];
//        char[] characterArr = new char[4];
//        String[] stringArr = new String[5];
//
//
//
//        Food food1= new Food("Pizza");
//        Food food2= new Food("Doughnuts");
//        Food food3 = new Food("Chicken");
//
//        Food[] refrigerator = {food1, food2, food3};
//
//        System.out.println(refrigerator[0].name);
//        System.out.println(refrigerator[1].name);
//        System.out.println(refrigerator[2].name);

        ///PASSING OBJECTS TO METHODS
//        Garage parkNYC = new Garage();
//        Car myCar = new Car(" BMW ");
//        Car myCarTwo = new Car(" Tesla ");
//        parkNYC.park(myCar);
//        parkNYC.park(myCarTwo);

        ///THE STATIC KEYWORDS MODIFIER

        //Static members are OWNED by the class,anything that the class owns is owned by all members of this class

//        Friend friend1 = new Friend("Spongebob");
//        Friend friend2 = new Friend("Patrick");
//        Friend friend3 = new Friend("Squidward");
//        System.out.println(Friend.numberOfFriends); //Can be accessed without instantiation.
//
//        System.out.println(friend1.numberOfFriends); //possible to access through the instantiated obj but NOT recommended.
//        Friend.getNumberOfFriends();
//
//        //The Math.round() method is a public static method!!!
//

//        Bicycle bike = new Bicycle();
//        bike.go();
//        System.out.println(bike.speed);
//        System.out.println(bike.wheels);
////
//        Animal animal = new Animal();
//        Dog fido = new Dog();
//
//        animal.speak();
//        fido.speak();

//        Hero superman = new Hero("Superman", 30, "Flying & Strong");
//        Hero batman = new Hero("Batman", 42, "$$$$");
//        System.out.println(superman);
//        System.out.println(batman);

        //abstract classes = cannot be instantiated, but can have subclasses that can.

        //ACCESS MODIFIERS add a laye rof security to our program
        /// They include, public, private, protected
        ///package 1 and 2 have the exercises

//        Boat yatch = new Boat("Searide", "Cooper33", 2024);
//        System.out.println(yatch.getMake());
//        System.out.println(yatch.getModel());
//        System.out.println(yatch.getYear());
//        yatch.setMake("Cooper55");
//        System.out.println(yatch.getMake());
//
//        Boat jetski = new Boat("Jet44", "Mini", 2023);
//        System.out.println(jetski.getMake());


        ///COPYING OBJECTS IN JAVA

//        Boat russianYatch = new Boat("Pravda", "Russian Doll", 2024);
//        Boat englishYatch = new Boat ("Kingdom", "Elizabeth", 2022);
//        System.out.println(russianYatch);
//        System.out.println(englishYatch);
//        englishYatch.copy(russianYatch);


        ///We have to create a copy function and in that fn we copy over all values. thats how we make a true copy
        //But what if we want to create a copy upon instantiation?  Then we must overload the constructor!

//        Boat secondRussianYatch = new Boat(russianYatch);
//
//        System.out.println(secondRussianYatch.getMake());
//        System.out.println(secondRussianYatch.getYear());
//        System.out.println(secondRussianYatch.getModel());


        //INTERFACES --  A template that can be applied to a class
        //Similar concept to inheritance but specifics what a class has/must do.
        //classes can apply MORE than 1 interface, inheritance is limited to 1 super.

//        Rabbit rabbo = new Rabbit();
//        rabbo.flee();
//
//        Hawk hawk = new Hawk();
//        hawk.hunt();
//
//        Fish fisho = new Fish();
//        fisho.hunt();
//        fisho.flee();

        //DYNAMIC POLYMORPHISM IN JAVA
        //Polymorphism AFTER COMPILATION (During runtime);

        //A corvette, is a car, a vehicle, and an object.
//        Animal animal;
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("What animal do you want");
//        System.out.println("1 = dog, or 2=cat");
//        int input = scanner.nextInt();
//
//        if (input==1){
//            animal=new Dog();
//            animal.speak();
//        } else if (input==2){
//            animal=new Cat();
//            animal.speak();
//        }else {
//            animal = new Animal();
//            System.out.println("That choice was invalid");
//            animal.speak();
//        }
      //could be a dog or cat, dont know. the user will choose.

            //exception - an even that occurs during execution that would disrupt the normal flow
        // using try,catch,finally blocks
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Enter a whole number to divide");
//            int x = scanner.nextInt();
//            System.out.println("Enter a whole number to divide the prior # by:");
//            int y = scanner.nextInt();
//
//            int z = x/y;
//            System.out.println("The result is: " + z);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Cannot divide by zero");//specific exception preferred
//        }
//        catch(InputMismatchException e){
//            System.out.println("Please only enter numbers omfg");//specific exception preferred
//        }
//        catch(Exception e){
//            System.out.println("Something went wrong"); //UMBRELLA EXCEPTION HANDLING FOR ALL OTHER EXCEPTIONS;
//        }
//        finally{
//            System.out.println("This will always print"); // last execution block, will always execute;
//            scanner.close();  // good practice to close scanner;
        //You can avoid explicit resource closing, if you use try with resources (i.e. try(Scanner scanner = new Scanner(System.in)){})
//        }
//

        //Generics - enable classes and interfaces to be parameters when defining classes, interface and methods
        //a benefit is to eliminate the need of multiple versions of methods and classes. 1 version for ALL TYPES.

        Integer [] intArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] doubleArray ={1.5,2.5,3.5,4.5};
        Character[] charArray = {'H','E', 'L', 'L', 'O'};
        String[] stringArray = {"Hello", "World", "Coding"};

//        displayArray(doubleArray);
        System.out.println(getFirst(doubleArray));

    }
    //GENERICS!!! (You can limit the access by using bounded parameters);
    public static <Thing> void displayArray(Thing[] arr){
        for(Thing i : arr){
            System.out.println(i);
        }
    }
    //Generic in returning a THING.
    public static <Thing> Thing getFirst(Thing[] arr){
        return arr[0];
    }


//    static void hello(String newStr, int age) {
//        System.out.println("HELLO " + newStr);
//        System.out.println("You Are " + age);
//    }
//    static int add(int a, int b){
//        System.out.println("This is overload 1");
//        return a+b;
//    }
//
//    static int add(int a, int b, int c){
//        System.out.println("This is overload 2");
//        return a+ b + c;
//    }
//    static int add(int a, i nt b, int c, int d){
//        System.out.println("This is overload 3");
//        return a+b+c+d;
//    }
//    static double add(double a, double b){
//        System.out.println("This is overload 5 (Doubles)");
//        return a+b;
//    }


}
