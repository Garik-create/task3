package transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               Integer maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    public void printBus() {
        System.out.printf("Автобус %s, модель %s %s цвета, %d года выпуска в %s, скорость передвижения - %d км/ч,\n",
                getBrand(), getModel(), getColor(), getProductionYear(), getProductionCountry(),
                getMaxSpeed());
    }
}
