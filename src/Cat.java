public class Cat extends Animal{
    @Override
    void speak() {
//        super.speak(); //calls the parent class usage of the speak method.
        System.out.println("The cat barks");
    }
}
