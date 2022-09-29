package transport;

public class Car {
    public static class Key {
        private String remoteStart;
        private String accessWithoutKey;

        public Key(String remoteStart, String accessWithoutKey) {
            if (remoteStart != null && !remoteStart.isEmpty() && !remoteStart.isBlank()) {
                this.remoteStart = remoteStart;
            } else {
                System.out.println("Не указано");
            }
            if (accessWithoutKey != null && !accessWithoutKey.isEmpty() && !accessWithoutKey.isBlank()) {
                this.accessWithoutKey = accessWithoutKey;
            } else {
                System.out.println("Не указано");
            }
        }


        public String getRemoteStart() {
            return remoteStart;
        }

        public void setRemoteStart(String remoteStart) {
            this.remoteStart = remoteStart;
        }

        public String getAccessWithoutKey() {
            return accessWithoutKey;
        }

        public void setAccessWithoutKey(String accessWithoutKey) {
            this.accessWithoutKey = accessWithoutKey;
        }
    }

    public static class Insurance {
        private final int INSURANCE_TERMS;
        private final int INSURANCE_COST;
        private final int INSURANCE_NUMBER;

        public Insurance(int insuranceTerms, int insuranceCost, int insuranceNumber) {
            this.INSURANCE_TERMS = insuranceTerms;
            this.INSURANCE_COST = insuranceCost;
            this.INSURANCE_NUMBER = insuranceNumber;
        }

        public int getInsuranceTerms() {
            return INSURANCE_TERMS;
        }

        public int getInsuranceCost() {
            return INSURANCE_COST;
        }

        public int getInsuranceNumber() {
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
    public String number;
    private final int seatsAmount;
    public String wheels;


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
        if (speedBox != null && !speedBox.isBlank() && !speedBox.isEmpty()) {
            this.speedBox = speedBox;
        } else {
            this.speedBox = "Механика";
        }
        if (carType != null && !carType.isEmpty() && !carType.isBlank()) {
            this.carType = carType;
        } else {
            this.carType = "Седан";
        }
        if (number != null && !number.isBlank() && !number.isEmpty()) {
            this.number = number;
        } else {
            this.number = "x000xx000";
        }
        if (seatsAmount >= 1) {
            this.seatsAmount = seatsAmount;
        } else {
            this.seatsAmount = 0;
        }
        if (wheels.equalsIgnoreCase("зима") || wheels.equalsIgnoreCase("лето")) {
            this.wheels = wheels;
        } else {
            this.wheels = "Не указано";
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
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeedBox() {
        return speedBox;
    }

    public void setSpeedBox(String speedBox) {
        this.speedBox = speedBox;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void printData() {
        System.out.printf("\n Автомобиль %s %s, объём двигателя %.1f литра, цвет %s, сборка %d, страна %s, коробка передач: %s, кузов: %s, номер: %s, количество мест: %d, резина: %s",
                brand, model, engineVolume, color, productionYear, productionCountry, speedBox,
                carType, number, seatsAmount, wheels);
    }

    public void changeWheels(int temperature, String wheels) {
        if (temperature < 8 && this.wheels.equalsIgnoreCase("лето")) {
            System.out.println("Смени резину на зимнюю!");
        } else if (temperature >= 8 && this.wheels.equalsIgnoreCase("зима")) {
            System.out.println("Смени резину на летнюю!");
        } else {
            System.out.println("Резину менять не надо.");
        }
    }

    public void isNumberTrue(String number) {
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
