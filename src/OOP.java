public class OOP {
    public static void main(String[] args){
//        Car myCarOne = new Car();
//        Car myCarTwo = new Car();
//        System.out.println(myCarOne.make);
//        System.out.println(myCarTwo.make);
        Human Rick = new Human("Ricky", 32, 200);
        System.out.println(Rick.name);
        Human Joe = new Human("Joe", 22, 100);
        System.out.println(Joe.name);
        Joe.eat();
        Rick.sleep();
    }
}
