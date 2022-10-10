public class Main {
    public static void main(String[] args) {

        Car granta = new Car("Lada","Granta",1.7,"желтый",2015, "Россия");
        System.out.println("Марка автомобиля " + granta.brand +
                ", модель автомобиля " + granta.model +
                ", объем двигателя " + granta.volumeOfEngine +
                ", цвет автомобиля " + granta.colour +
                ", год выпуска " + granta.yearOfProduction +
                ", страна производства " + granta.countryOfOrigin);

        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия");

        System.out.println("марка автомобиля " + audi.brand +
                ", модель автомобиля " + audi.model +
                ", объем двигателя " + audi.volumeOfEngine +
                ", цвет автомобиля " + audi.colour +
                ", год выпуска " + audi.yearOfProduction +
                ", страна производства " + audi.countryOfOrigin);

        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия");

        System.out.println("Марка автомобиля " + bmw.brand +
                ", модель автомобиля " + bmw.model +
                ", объем двигателя " + bmw.volumeOfEngine +
                ", цвет автомобиля " + bmw.colour +
                ", год выпуска " + bmw.yearOfProduction +
                ", страна производства " + bmw.countryOfOrigin);

        Car kia = new Car("Kia","Sportage 4 поколение",2.4,"красный",2018,"Южная Корея");

        System.out.println("Марка автомобиля " + kia.brand +
                ", модель автомобиля " + kia.model +
                ", объем двигателя " + kia.volumeOfEngine +
                ", цвет автомобиля " + kia.colour +
                ", год выпуска " + kia.yearOfProduction +
                ", страна производства " + kia.countryOfOrigin);

        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");

        System.out.println("Марка автомобиля " + hyundai.brand +
                ", модель автомобиля " + hyundai.model +
                ", объем двигателя " + hyundai.volumeOfEngine +
                ", цвет автомобиля " + hyundai.colour +
                ", год выпуска " + hyundai.yearOfProduction +
                ", страна производства " + hyundai.countryOfOrigin);

    }
}