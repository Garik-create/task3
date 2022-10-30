package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    //    private ArrayList<Transport> transportsInService;

    private List<Sponsor> sponsors = new ArrayList<>();

    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();

//    private final int productionYear;
//    private final String productionCountry;
//    private String color;
//    private int maxSpeed;
//    private String fuel;
    public Transport(String brand,
                     String model,
                     double engineVolume)
//                     int productionYear,
//                     String productionCountry,
//                     String color,
//                     Integer maxSpeed,
//                     String fuel)
    {
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
        setEngineVolume(engineVolume);

        sponsors = new ArrayList<>();

        mechanics = new ArrayList<>();

//        if (productionYear != 0) {
//            this.productionYear = productionYear;
//        } else {
//            this.productionYear = 2000;
//        }
//        if (productionCountry != null) {
//            this.productionCountry = productionCountry;
//        } else {
//            this.productionCountry = "default";
//        }
//        setColor(color);
//        setMaxSpeed(maxSpeed);
//        setFuel(fuel);
    }

    public void addDriver(Driver<?> driver)  {
        this.drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic) {
        this.mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor) {
        this.sponsors.add(sponsor);
    }


    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public abstract void passDiagnostics();

    public abstract void startMotion();

    public abstract void finishMotion();

//    public ArrayList<Transport> getTransportsInService() {
//        return transportsInService;
//    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public abstract boolean service();

    @Override
    public abstract String toString();

    //    public abstract void refill(String fuel);
//    public abstract void printData2();
//    public String getFuel() {

//        return fuel;

//    }

//    public int getProductionYear() {
//        return productionYear;
//    }

//    public String getProductionCountry() {
//        return productionCountry;
//    }

//    public String getColor() {
//        return color;
//    }

//    public int getMaxSpeed() {
//        return maxSpeed;
//    }

//    public void setColor(String color) {
//        if (color != null && !color.isBlank()) {
//            this.color = color;
//        } else {
//            this.color = "Цвет не указан";
//        }
//    }

//    public void setMaxSpeed(Integer maxSpeed) {
//        if (maxSpeed != null && maxSpeed >= 0) {
//            this.maxSpeed = maxSpeed;
//        } else {
//            this.maxSpeed = 0;
//        }
//    }

//    private void setFuel(String fuel) {
//        if (fuel == null || fuel.isBlank()) {
//            this.fuel = "petrol";
//        } else if (fuel.equals("petrol") || fuel.equals("diesel") || fuel.equals("batteries")) {
//            this.fuel = fuel;
//        } else {
//            this.fuel = "petrol";
//        }
//    }

}
