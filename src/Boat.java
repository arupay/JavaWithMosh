public class Boat {
    private String make;
    private String model;
    private int year;

    Boat(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Boat(Boat boatToCopy){
        this.setMake(boatToCopy.getMake());
        this.setModel(boatToCopy.getModel());
        this.setYear(boatToCopy.getYear());
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void copy(Boat x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }

}
