public class Fish implements Predator, Prey{
    @Override
    public void hunt(){
        System.out.println("This fish is hunting smaller fish");
    }
    public void flee(){
        System.out.println("This fish is fleeing from larger fish");
    }

}
