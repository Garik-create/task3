package transport;

import java.time.LocalDate;

public class Car extends Transport {
//    public static class Key {
//
//        private String remoteStart;
//        private String accessWithoutKey;

//        public Key(String remoteStart, String accessWithoutKey) {
//            if (remoteStart != null && !remoteStart.isBlank()) {
//                this.remoteStart = remoteStart;
//            } else {
//                System.out.println("Не указано");
//            }
//            if (accessWithoutKey != null && !accessWithoutKey.isBlank()) {
//                this.accessWithoutKey = accessWithoutKey;
//            } else {
//                System.out.println("Не указано");
//            }
//        }
//
//
//        public String getRemoteStart() {
//            return remoteStart;
//        }
//
//        public String getAccessWithoutKey() {
//            return accessWithoutKey;
//        }
//
//    }

//    public static class Insurance {
//
//        private final LocalDate insuranceTerms;
//        private final Integer insuranceCost;
//        private final String insuranceNumber;
//
//        public void checkInsuranceTerms(LocalDate insuranceTerms) {
//            if (insuranceTerms.plusDays(365).isBefore(LocalDate.now())) {
//                System.out.println("Нужно срочно ехать оформлять страховку!");
//            }
//        }
//
//        public static void checkInsuranceNumber(String insuranceNumber) {
//            if (insuranceNumber.length() != 9) {
//                System.out.println("Номер страховки некорректный!");
//            }
//        }

//        public Insurance(LocalDate insuranceTerms, Integer insuranceCost, String insuranceNumber) {
//            if (insuranceTerms != null && !insuranceTerms.isAfter(LocalDate.now())) {
//                this.insuranceTerms = insuranceTerms;
//            } else {
//                this.insuranceTerms = LocalDate.now();
//            }
//            if (insuranceCost != null && insuranceCost != 0) {
//
//                this.insuranceCost = insuranceCost;
//            } else {
//                this.insuranceCost = 1;
//            }
//            if (insuranceNumber != null && !insuranceNumber.isBlank()) {
//                this.insuranceNumber = insuranceNumber;
//            } else {
//                this.insuranceNumber = "Введите номер полиса!";
//            }
//        }
//
//        public LocalDate getInsuranceTerms() {
//            return insuranceTerms;
//        }
//
//        public Integer getInsuranceCost() {
//            return insuranceCost;
//        }
//
//        public String getInsuranceNumber() {
//            return insuranceNumber;
//        }
//
//    }

//    public double engineVolume;

//    public String speedBox;
//    private final String carType;
//    private String number;
//    private final int seatsAmount;
//    private boolean wheels;
//    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume)
//               String color,
//               int productionYear,
//               String productionCountry,
//               String speedBox,
//               String carType,
//               String number,
//               int seatsAmount,
//               String wheels,
//               Insurance insurance,
//               Integer maxSpeed,
//               String fuel)
               {
        super(brand, model,engineVolume);

//        setEngineVolume(engineVolume);

//        setSpeedBox(speedBox);

//        if (carType != null && !carType.isBlank()) {
//            this.carType = carType;
//        } else {
//            this.carType = "Седан";
//        }
//        setNumber(number);
//
//        if (seatsAmount >= 1) {
//            this.seatsAmount = seatsAmount;
//        } else {
//            this.seatsAmount = 0;
//        }
//        setWheels(wheels);
//        setInsurance(insurance);

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

    //    @Override
//    public void refill(String fuel) {
//        if (fuel.equals("petrol") || fuel.equals("diesel")) {
//            System.out.println("Заехать на запрвку, подъехать к колонке, заправиться нужным топливом.");
//        } else {
//            System.out.println("Заехать на паркинг, подъехать к розетке и зарядить батареи.");
//        }
//    }

//    @Override
//    public void printData2() {
//        System.out.printf("\nАвтомобиль %s %s, используемое топливо %s.", getBrand(), getModel(), getFuel());
//    }

//    public void printData(boolean wheels) {
//        String wheels1 = "";
//        if (wheels) {
//            wheels1 = "зимняя";
//        }
//        if (!wheels) {
//            wheels1 = "летняя";
//        }
//        System.out.printf("\n Автомобиль %s %s, объём двигателя %.1f литра, цвет %s, сборка %d, страна %s, коробка\n"
//                        + " передач: %s, кузов: %s, номер: %s, количество мест: %d, резина: %s, максимальная \n" +
//                        "скорость: %d км/час.\n", getBrand(), getModel(),
//                engineVolume, getColor(), getProductionYear(), getProductionCountry(), speedBox, carType, number,
//                seatsAmount, wheels1, getMaxSpeed());
//    }

//    public void changeWheels(int temperature, boolean wheels) {
//        if (temperature < 8 && !wheels) {
//            System.out.println("Смени резину на зимнюю!");
//        } else if (temperature >= 8 && wheels) {
//            System.out.println("Смени резину на летнюю!");
//        } else {
//            System.out.println("Резину менять не надо.");
//        }
//    }

//    public void checkNumberTrue(String number) {
//        if (number.length() != 9 || number.charAt(0) < 1072 || number.charAt(0) > 1103) {
//            System.out.println("\nНеверно указан номер");
//            return;
//        }
//        for (int i = 1; i <= 3; i++) {
//            if ((int) number.charAt(i) < 48 || number.charAt(i) > 57) {
//                System.out.println("\nНеверно указан номер");
//                return;
//            }
//        }
//        for (int i = 4; i <= 5; i++) {
//            if ((int) number.charAt(i) < 1072 || number.charAt(i) > 1103) {
//                System.out.println("\nНеверно указан номер");
//                return;
//            }
//        }
//        for (int i = 6; i <= 8; i++) {
//            if ((int) number.charAt(i) < 48 || number.charAt(i) > 57) {
//                System.out.println("\nНеверно указан номер");
//                return;
//            }
//        }
//    }

//    public Insurance getInsurance() {
//        return insurance;
//    }
//
//
//    public String getCarType() {
//        return carType;
//    }
//
//    public int getSeatsAmount() {
//        return seatsAmount;
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }

//    public double setEngineVolume(double engineVolume) {
//        if (engineVolume != 0) {
//            this.engineVolume = engineVolume;
//        } else {
//            this.engineVolume = 1.5;
//        }
//        return engineVolume;
//    }
//
//    public Insurance setInsurance(Insurance insurance) {
//        this.insurance = insurance;
//        return this.insurance;
//    }
//
//
//    public String getSpeedBox() {
//        return speedBox;
//    }
//
//    public String setSpeedBox(String speedBox) {
//        if (speedBox != null && !speedBox.isBlank()) {
//            this.speedBox = speedBox;
//        } else {
//            this.speedBox = "Механика";
//        }
//        return speedBox;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public String setNumber(String number) {
//        if (number != null && !number.isBlank()) {
//            this.number = number;
//        } else {
//            this.number = "x000xx000";
//        }
//        return number;
//    }
//
//    public boolean getWheels() {
//        return wheels;
//    }
//
//    public boolean setWheels(String wheels) {
//        if (wheels.equalsIgnoreCase("зима")) {
//            this.wheels = true;
//        } else if (wheels.equalsIgnoreCase("лето")) {
//            this.wheels = false;
//        } else {
//            this.wheels = false;
//        }
//        return this.wheels;
//    }

}
