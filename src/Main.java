import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car(null, null, 1.7, "Жёлтый", 2015,
                null, "Механика", "Седан", "е9e2ыв333", 4,
                "Зима");

        Car audiA850LTdiQuattro = new Car("Audi", "A8 50 L TDI quattro", 0, "Чёрный",
                2020, "Германия", "автомат", "Хэтчбек", "е345нн333",
                5, "лето");

        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021,

                "Германия", "робот", "универсал", "у999ке888",
                3, "лто");
        Car kiaSportage = new Car("Kia", "4 поколение", 2.4, "Красный", 0,
                "Южная Корея", "полуавтомат", "лифтбек", "а444пр666",
                8, "стужа");


        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый",
                2016,
                "Южная Корея", "вариатор", "минивэн", "у432ке456",
                15, "Лето");


        ladaGrande.printData(ladaGrande.getWheels());
        audiA850LTdiQuattro.printData(audiA850LTdiQuattro.getWheels());
        bmwZ8.printData(bmwZ8.getWheels());
        kiaSportage.printData(kiaSportage.getWheels());
        hyundaiAvante.printData(hyundaiAvante.getWheels());
        System.out.println();
        System.out.println();


        int temperature = 9;

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

    }
}
