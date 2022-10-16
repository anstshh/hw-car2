import transport.Car;

public class Main {
    public static void main(String[] args) {


        Car granta = new Car("Lada","Granta",1.7,"желтый",2015, "Россия");

        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия");
        audi.setGears("автомат");


        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия");
        bmw.setSummerTyres(false);



        Car kia = new Car("Kia","Sportage 4 поколение",2.4,"красный",2018,"Южная Корея");

        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");

        printInfo(granta);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);


    }
    private static void printInfo(Car car) {
        System.out.println("Марка автомобиля " + car.getBrand() +
                ", модель автомобиля " + car.getModel() +
                ", объем двигателя " + car.getVolumeOfEngine() +
                ", цвет автомобиля " + car.getColour() +
                ", год выпуска " + car.getYearOfProduction() +
                ", страна производства " + car.getCountryOfOrigin());

    }

    }
}