package transport;

public class Truck extends Transport implements Competing {

    public enum CarBodyType {
        BDY_N1("с полной массой до 3,5 тонн"),
        BDY_N2("с полной массой свыше 3,5 до 12 тонн"),
        BDY_N3("с полной массой свыше 12 тонн");

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

    public void foundCarBodyType(String carBodyView) {
        CarBodyType carBodyType = CarBodyType.valueOf(carBodyView);

        switch (carBodyType) {
            case BDY_N1:
                System.out.println(CarBodyType.BDY_N1.getCarBodyName());
                return;
            case BDY_N2:
                System.out.println(CarBodyType.BDY_N2.getCarBodyName());
                return;
            case BDY_N3:
                System.out.println(CarBodyType.BDY_N3.getCarBodyName());
                return;
            default:
                System.out.println("Данных по авто недостаточно");
        }
    }


    public Truck(String brand,
                 String model,
                 double engineVolume) {
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
    public void doPitStop() {
        System.out.println("Проехал 20 кругов.");
        System.out.println("Сверни в тех. зону.");
        System.out.println("Поменяй резину.");
        System.out.println("Вернись в гонку.");
    }

    @Override
    public void getBestTimeOfCircle() {
        System.out.println("Проехал 20 кругов.");
        System.out.println("Засеки время прохожднения каждого круга.");
        System.out.println("Выбери лучшее время.");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Проехал 20 кругов.");
        System.out.println("Засеки время прохожднения каждого круга.");
        System.out.println("Определи максимальную скорость на круге.");
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
        return "Грузовой автомобиль " + getBrand() + " " + getModel() + ", объём двигателя "
                + getEngineVolume() + " литров.";
    }

    //    @Override
//    public void refill(String fuel) {
//
//    }

//    @Override
//    public void printData2() {
//
//    }
}
