package transport;

public class Car {
    public static class Key {
        private String remoteStart;
        private String accessWithoutKey;

        public Key(String remoteStart, String accessWithoutKey) {
            if (remoteStart != null && !remoteStart.isBlank()) {
                this.remoteStart = remoteStart;
            } else {
                System.out.println("Не указано");
            }
            if (accessWithoutKey != null && !accessWithoutKey.isBlank()) {
                this.accessWithoutKey = accessWithoutKey;
            } else {
                System.out.println("Не указано");
            }
        }


        public String getRemoteStart() {
            return remoteStart;
        }

        public String getAccessWithoutKey() {
            return accessWithoutKey;
        }
    }

    public static class Insurance {
        private final Integer INSURANCE_TERMS;
        private final Integer INSURANCE_COST;
        private final String INSURANCE_NUMBER;

        public Insurance(Integer insuranceTerms, Integer insuranceCost, String insuranceNumber) {
            if (insuranceTerms!=null && insuranceTerms !=0) {
                this.INSURANCE_TERMS = insuranceTerms;
            } else {
                this.INSURANCE_TERMS = 1;
            }
            if (insuranceCost != null && insuranceCost != 0) {

                this.INSURANCE_COST = insuranceCost;
            } else {
                this.INSURANCE_COST = 1;
            }
            if (insuranceNumber != null && !insuranceNumber.isBlank()) {
                this.INSURANCE_NUMBER = insuranceNumber;
            } else {
                this.INSURANCE_NUMBER = "Введите номер полиса!";
            }
        }

        public void checkInsuranceTerms(Integer insuranceTerms) {

        }

        public Integer getInsuranceTerms() {
            return INSURANCE_TERMS;
        }

        public Integer getInsuranceCost() {
            return INSURANCE_COST;
        }

        public String getInsuranceNumber() {
            return INSURANCE_NUMBER;
        }
    }
    private final String brand;
    private final String model;
    public double engineVolume;
    public String color;
    private final int productionYear;
    private final String productionCountry;
    public String speedBox;
    private final String carType;
    private String number;
    private final int seatsAmount;
    private boolean wheels;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String speedBox,
               String carType,
               String number,
               int seatsAmount,
               String wheels) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (productionYear != 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
        if (speedBox != null && !speedBox.isBlank()) {
            this.speedBox = speedBox;
        } else {
            this.speedBox = "Механика";
        }
        if (carType != null && !carType.isBlank()) {
            this.carType = carType;
        } else {
            this.carType = "Седан";
        }
        if (number != null && !number.isBlank()) {
            this.number = number;
        } else {
            this.number = "x000xx000";
        }
        if (seatsAmount >= 1) {
            this.seatsAmount = seatsAmount;
        } else {
            this.seatsAmount = 0;
        }
        if (wheels.equalsIgnoreCase("зима")) {
            this.wheels = true;
        } else if (wheels.equalsIgnoreCase("лето")) {
            this.wheels = false;
        } else {
        this.wheels = false;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getCarType() {
        return carType;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public String getSpeedBox() {
        return speedBox;
    }

    public void setSpeedBox(String speedBox) {
        if (speedBox != null && !speedBox.isBlank()) {
            this.speedBox = speedBox;
        } else {
            this.speedBox = "Механика";
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number != null && !number.isBlank()) {
            this.number = number;
        } else {
            this.number = "x000xx000";
        }
    }

    public boolean getWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        if (wheels) {
            this.wheels = wheels;
        }
    }

    String wheels1;
    public void printData(boolean wheels) {
        if (wheels) {
            wheels1 = "зимняя";
        }
        if (!wheels) {
            wheels1 = "летняя";
        }
        System.out.printf("\n Автомобиль %s %s, объём двигателя %.1f литра, цвет %s, сборка %d, страна %s, коробка\n" +
                        " передач: %s, кузов: %s, номер: %s, количество мест: %d, резина: %s\n",
                brand, model, engineVolume, color, productionYear, productionCountry, speedBox,
                carType, number, seatsAmount, wheels1);
    }

    public void changeWheels(int temperature, boolean wheels) {
        if (temperature < 8 && !wheels) {
            System.out.println("Смени резину на зимнюю!");
        } else if (temperature >= 8 && wheels) {
            System.out.println("Смени резину на летнюю!");
        } else {
            System.out.println("Резину менять не надо.");
        }
    }

    public void checkNumberTrue(String number) {
        if (number.length() != 9 || number.charAt(0) < 1072 || number.charAt(0) > 1103) {
            System.out.println("\nНеверно указан номер");
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if ((int) number.charAt(i) < 48 || number.charAt(i) > 57) {
                System.out.println("\nНеверно указан номер");
                return;
            }
        }
        for (int i = 4; i <= 5; i++) {
            if ((int) number.charAt(i) < 1072 || number.charAt(i) > 1103) {
                System.out.println("\nНеверно указан номер");
                return;
            }
        }
        for (int i = 6; i <= 8; i++) {
            if ((int) number.charAt(i) < 48 || number.charAt(i) > 57) {
                System.out.println("\nНеверно указан номер");
                return;
            }
        }
    }
}
