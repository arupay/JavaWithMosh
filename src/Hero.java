public class Hero extends RegularHuman{
    String power;
    Hero(String name, int age, String power){
        super(name, age);
        this.power = power;
    }
    @Override
    public String toString(){
        return super.toString() + " " + power;
    }

}
