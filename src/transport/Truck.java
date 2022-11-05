package transport;

public class Truck extends Transport implements Competing{

    private boolean isChecked;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 boolean isChecked)
    {
        super(brand, model, engineVolume);
        this.isChecked = isChecked;
    }

    @Override
    public void passDiagnostics() {
        try {
            isPassDiagnostics(isChecked());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void isPassDiagnostics(boolean isChecked) {
        if (!isChecked) {
            throw new RuntimeException("Необходимо пройти диагносику!");
        }
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

//    public char getLicenseType() {
//        return licenseType;
//    }



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
    public boolean service() {
        return false;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль " + getBrand() + " " + getModel() + ", объём двигателя "
                + getEngineVolume()+" литров.";
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
