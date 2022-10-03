import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car ladaGrande = new Car("null", "null", 1.7, "Жёлтый", 2015,
                null, "Механика", "Седан", "е922ыв333", 4,
                "Зима", new Car.Insurance(LocalDate.of(1988, 12, 11), 1000,
                "123456789"));

        Car audiA850LTdiQuattro = new Car("Audi", "A8 50 L TDI quattro", 0, "Чёрный",
                2020, "Германия", "автомат", "Хэтчбек", "е345нн333",
                5, "лето", new Car.Insurance(LocalDate.of(2021, 12, 10),
                10000, "987654321"));

        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021,

                "Германия", "робот", "универсал", "у999ке888",
                3, "лто", new Car.Insurance(LocalDate.of(2022, 12, 11),
                4000, "122345ff1"));

        Car kiaSportage = new Car("Kia", "4 поколение", 2.4, "Красный", 0,
                "Южная Корея", "полуавтомат", "лифтбек", "а444пр666",
                8, "стужа", new Car.Insurance(LocalDate.of(2022, 10, 1),
                2000, "1234567890"));


        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый",
                2016,
                "Южная Корея", "вариатор", "минивэн", "у432ке456",
                15, "Лето", new Car.Insurance(LocalDate.of(1999, 6, 2),
                12000, "uytbyfert"));


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
    }
}
