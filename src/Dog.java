public class Dog extends Animal{
    @Override
    void speak() {
        super.speak(); //calls the parent class usage of the speak method.
        System.out.println("The dog barks");
    }
}
