package CopyObjects;

public class Car {

    private String make;
    private String model;
    private int year;


    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    //copy constructor, example 2nd how to copy an object
    Car(Car x) {
        this.copy(x);
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private void setYear(int year) {
        this.year = year;
    }


    // 1st example how to copy an object
    public void copy(Car x){
        this.setMake(x.getMake());
        this.setYear(x.getYear());
        this.setModel(x.getModel());
    }


}
