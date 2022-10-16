package transport;

public class Car {

    private final String brand;
    private final String model;
    private double volumeOfEngine;
    private String colour;
    private final int yearOfProduction;
    private final  String countryOfOrigin;
    private String gears;
    private final  String typeOfBody;
    private String regNumber;
    private final  int seatsAmount;
    private boolean summerTyres;
    private Key key;


    public Car(String brand, String model, double volumeOfEngine, String colour, int yearOfProduction, String countryOfOrigin, Key key) {
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
        if(key==null){
            this.key = new Key();
        } else {
            this.key = key;
        }
        this.typeOfBody = "седан";
        this.regNumber = "х000хх000";
        this.seatsAmount = 5;
        this.gears = "механика";
        this.summerTyres = true;


    }

    public String getColour() {
        return colour;
    }

    public String getGears() {
        return gears;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(double volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void setRegNumber(String regNumber) {
        {
            if (regNumber == null) {
                this.regNumber = "х000хх000";
            } else {
                this.regNumber = regNumber;
            }
        }
    }
    public void setGears(String gears) {
    if(gears==null) {
        this.gears = "механика";
    }else{
            this.gears = gears;
        }
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getModel() {
        return model;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void changeTyres() {
        summerTyres =! summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean checkCorrectRegNumber(){
        if(regNumber.length()!=9){
            return false;
        }
        char [] chars  =regNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0]) || !Character.isDigit(chars[4]) || !Character.isDigit(chars[5])){
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);

    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKetAccess;

        public Key(boolean remoteRunEngine, boolean withoutKetAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKetAccess = withoutKetAccess;
        }

        public Key() {
            this(false,false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKetAccess() {
            return withoutKetAccess;
        }
    }
}

