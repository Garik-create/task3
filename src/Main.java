import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car(null, null, 1.7, "Жёлтый", 2015,
                null, "Механика", "Седан", "е922ыв333", 4,
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


        ladaGrande.printData();
        audiA850LTdiQuattro.printData();
        bmwZ8.printData();
        kiaSportage.printData();
        hyundaiAvante.printData();
        System.out.println();
        System.out.println();


        int temperature = 7;

        ladaGrande.changeWheels(temperature, ladaGrande.wheels);
        audiA850LTdiQuattro.changeWheels(temperature, audiA850LTdiQuattro.wheels);
        bmwZ8.changeWheels(temperature, bmwZ8.wheels);
        kiaSportage.changeWheels(temperature, kiaSportage.wheels);
        hyundaiAvante.changeWheels(temperature, hyundaiAvante.wheels);

        ladaGrande.isNumberTrue(ladaGrande.number);
        audiA850LTdiQuattro.isNumberTrue(audiA850LTdiQuattro.number);
        bmwZ8.isNumberTrue(bmwZ8.number);
        kiaSportage.isNumberTrue(kiaSportage.number);
        hyundaiAvante.isNumberTrue(hyundaiAvante.number);

    }
}
