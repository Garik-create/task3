import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car ladaGrande = new Car("null", "null", 1.7, "Жёлтый", 2015,
                null, "Механика", "Седан", "е922ыв333", 4,
                "Зима", new Car.Insurance(LocalDate.of(1988, 12, 11), 1000,
                "123456789"),60);

        Car audiA850LTdiQuattro = new Car("Audi", "A8 50 L TDI quattro", 0, "Чёрный",
                2020, "Германия", "автомат", "Хэтчбек", "е345нн333",
                5, "лето", new Car.Insurance(LocalDate.of(2021, 12, 10),
                10000, "987654321"), 70);

        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021,

                "Германия", "робот", "универсал", "у999ке888",
                3, "лто", new Car.Insurance(LocalDate.of(2022, 12, 11),
                4000, "122345ff1"), 90);

        Car kiaSportage = new Car("Kia", "4 поколение", 2.4, "Красный", 0,
                "Южная Корея", "полуавтомат", "лифтбек", "а444пр666",
                8, "стужа", new Car.Insurance(LocalDate.of(2022, 10, 1),
                2000, "1234567890"), 100);


        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый",
                2016,
                "Южная Корея", "вариатор", "минивэн", "у432ке456",
                15, "Лето", new Car.Insurance(LocalDate.of(1999, 6, 2),
                12000, "uytbyfert"), 200);


        ladaGrande.printData(ladaGrande.getWheels());
        audiA850LTdiQuattro.printData(audiA850LTdiQuattro.getWheels());
        bmwZ8.printData(bmwZ8.getWheels());
        kiaSportage.printData(kiaSportage.getWheels());
        hyundaiAvante.printData(hyundaiAvante.getWheels());
        System.out.println();
        System.out.println();


        int temperature = 7;

        ladaGrande.changeWheels(temperature, ladaGrande.getWheels());
        audiA850LTdiQuattro.changeWheels(temperature, audiA850LTdiQuattro.getWheels());
        bmwZ8.changeWheels(temperature, bmwZ8.getWheels());
        kiaSportage.changeWheels(temperature, kiaSportage.getWheels());
        hyundaiAvante.changeWheels(temperature, hyundaiAvante.getWheels());

        ladaGrande.checkNumberTrue(ladaGrande.getNumber());
        audiA850LTdiQuattro.checkNumberTrue(audiA850LTdiQuattro.getNumber());
        bmwZ8.checkNumberTrue(bmwZ8.getNumber());
        kiaSportage.checkNumberTrue(kiaSportage.getNumber());
        hyundaiAvante.checkNumberTrue(hyundaiAvante.getNumber());

        System.out.println();
        Car.Insurance.checkInsuranceNumber(ladaGrande.getInsurance().getInsuranceNumber());
        ladaGrande.getInsurance().checkInsuranceTerms(LocalDate.now());

        System.out.println();
        System.out.println("Наследование. Д.з.1 задание 2");

        var lastochka = new Train("Ласточка", "B-901", 2011, 301,
                "России","",3500,6,"Белорусского вокзала",
                "Минск-Пассажирский", 11);

        var leningrad = new Train("Ленинград", "Д-125", 2019, 270, "России",
                "", 1700, 8, "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8);

        lastochka.printTrain();
        leningrad.printTrain();

        System.out.println();
        System.out.println("Наследование. Д.з.1 задание 3");

        var ikarus = new Bus("Икарус", "111", 1980, "Венгрии", "синего",
                120);

        var liaz = new Bus("Лиаз", "222", 2000, "России", "красного",
                150);

        var mersedes = new Bus("Мерседес", "333", 2020, "Германии", "жёлтого",
                180);

        ikarus.printBus();
        liaz.printBus();
        mersedes.printBus();
    }


}
