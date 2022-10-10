public class Car {

    public String brand;
    public String model;
    public double volumeOfEngine;
    public String colour;
    public int yearOfProduction;
    public String countryOfOrigin;

    public Car(String brand, String model, double volumeOfEngine, String colour, int yearOfProduction, String countryOfOrigin) {
        if(brand==null) {
            this.brand = "default";
        } else this.brand = brand;

        if(model==null) {
            this.model = "default";
        } else this.model = model;
        if(countryOfOrigin==null) {
            this.countryOfOrigin = "default";
        } else this.countryOfOrigin = countryOfOrigin;
        if(Double.compare(volumeOfEngine,0)==0) {
            this.volumeOfEngine = 1.5;
        } else this.volumeOfEngine = volumeOfEngine;
        if(colour==null) {
            this.colour = "белый";
        } else this.colour = colour;
        if(yearOfProduction==0) {
            this.yearOfProduction = 2000;
        } else this.yearOfProduction = yearOfProduction;


    }
}
