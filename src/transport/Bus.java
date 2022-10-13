package transport;

public class Bus extends Transport implements Competing {

    public enum CarBodyType {
        BDY_EXTRA_SMALL("до 10 мест"),
        BDY_SMALL("до 25 мест"),
        BDY_MEDIUM("40-50 мест"),
        BDY_LARGE("60-80 мест"),
        BDY_EXTRA_LARGE("100-120 мест");
        private String carBodyName;

        CarBodyType(String carBodyName) {
            this.carBodyName = carBodyName;
        }

        public String getCarBodyName() {
            return carBodyName;
        }

        public void setCarBodyName(String carBodyName) {
            this.carBodyName = carBodyName;
        }

    }

    public void foundCarBodyName(String carBodyView) {
        CarBodyType carBodyType = CarBodyType.valueOf(carBodyView);
        switch (carBodyType) {
            case BDY_EXTRA_LARGE:
                System.out.println(CarBodyType.BDY_EXTRA_LARGE.getCarBodyName());
                return;
            case BDY_LARGE:
                System.out.println(CarBodyType.BDY_LARGE.getCarBodyName());
                return;
            case BDY_SMALL:
                System.out.println(CarBodyType.BDY_SMALL.getCarBodyName());
                return;
            case BDY_MEDIUM:
                System.out.println(CarBodyType.BDY_MEDIUM.getCarBodyName());
                return;
            case BDY_EXTRA_SMALL:
                System.out.println(CarBodyType.BDY_EXTRA_SMALL.getCarBodyName());
                return;
            default:
                System.out.println("Данных по авто недостаточно");
        }
    }

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
        System.out.println("Включаю зажигание.");
        System.out.println("Снимаю машину с ручника.");
        System.out.println("Включаю передачу.");
        System.out.println("Нажимаю педаль газа.");
    }

    @Override
    public void finishMotion() {
        System.out.println("Нажимаю на педаль тормоза.");
        System.out.println("Выключаю передачу.");
        System.out.println("Ставлю машину на ручник.");
        System.out.println("Гашу двигатель");
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public void setEngineVolume(double engineVolume) {
        super.setEngineVolume(engineVolume);
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + ", объём двигателя "
                + getEngineVolume() + " литров.";
    }

    @Override
    public void doPitStop() {
        System.out.println("Проехал 50 кругов.");
        System.out.println("Сверни в тех. зону.");
        System.out.println("Поменяй резину.");
        System.out.println("Вернись в гонку.");
    }

    @Override
    public void getBestTimeOfCircle() {
        System.out.println("Проехал 50 кругов.");
        System.out.println("Засеки время прохожднения каждого круга.");
        System.out.println("Выбери лучшее время.");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Проехал 50 кругов.");
        System.out.println("Засеки время прохожднения каждого круга.");
        System.out.println("Определи максимальную скорость на круге.");
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
