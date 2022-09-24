public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void printData() {
        System.out.printf("\n Автомобиль %s %s, объём двигателя %.1f литра, цвет %s, сборка %d, страна %s.",
                brand, model, engineVolume, color, productionYear, productionCountry);
    }
}
