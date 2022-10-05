package transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               double engineVolume)
//               int productionYear,
//               String productionCountry,
//               String color,
//               Integer maxSpeed,
//               String fuel)
               {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMotion() {

    }

    @Override
    public void finishMotion() {

    }
}

//    @Override
//    public void refill(String fuel) {
//        if (fuel.equals("petrol") || fuel.equals("diesel")) {
//            System.out.println("Заехать на запрвку, подъехать к колонке, заправиться нужным топливом.");
//        }
//    }

//    @Override
//    public void printData2() {
//        System.out.printf("\nАвтобус %s %s, используемое топливо %s.", getBrand(), getModel(), getFuel());
//    }


//    public void printBus() {
//        System.out.printf("Автобус %s, модель %s %s цвета, %d года выпуска в %s, скорость передвижения - %d км/ч,\n",
//                getBrand(), getModel(), getColor(), getProductionYear(), getProductionCountry(),
//                getMaxSpeed());
//    }
//}
