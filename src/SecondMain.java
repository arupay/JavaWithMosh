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
