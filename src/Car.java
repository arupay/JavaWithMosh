public class Car {
    String make  ="Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "white";
    double price = 25000.00;

    void drive(){
        System.out.println("You are driving the car now");
    }
    void brake(){
        System.out.println("Brakes car");
    }

    public String toString(){
        String myString = make + "\n" + model + "\n" + year + "\n" + color;
        return myString;
    }
}
