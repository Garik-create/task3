package transport;

public class DriverB extends Driver<Car> {
    private char licenseType;

    public DriverB(char licenseType, String driverName, boolean isLicensed, int driverExperience, Car transport) {
        super(driverName, isLicensed, driverExperience, transport);
        this.licenseType = licenseType;
    }

//    public DriverB(char licenseType,
//                   B driverName,
//                   B isLicensed,
//                   B driverExperience,
//                   C brand,
//                   C model,
//                   C engineVolume) {
//        this.licenseType = licenseType;
//        this.driverName = driverName;
//        this.isLicensed = isLicensed;
//        this.driverExperience = driverExperience;
//        this.brand = brand;
//        this.model = model;
//        this.engineVolume = engineVolume;
//    }

    public char getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(char licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public void canDrive(Car transport) {
        if (getLicenseType() == 'B') {
            System.out.println("Водитель " + getDriverName() + " управляет автомобилем " + transport.getBrand() +
                    " " + transport.getModel() + " и \n" +
                    "будет участвовать в заезде.");
        } else {
            System.out.println("Водитель " + getDriverName() + " не участвует в заезде.");
        }
    }

//    public String getDriverName() {
//        return driverName;
//    }

//    public void setDriverName(String driverName) {
//        this.driverName = driverName;
//    }

//    public B getIsLicensed() {
//        return isLicensed;
//    }

//    public void setIsLicensed(B isLicensed) {
//        this.isLicensed = isLicensed;
//    }

//    public B getDriverExperience() {
//        return driverExperience;
//    }
//
//    public void setDriverExperience(B driverExperience) {
//        this.driverExperience = driverExperience;
//    }
//
//    public C getBrand() {
//        return brand;
//    }
//
//    public void setBrand(C brand) {
//        this.brand = brand;
//    }
//
//    public C getModel() {
//        return model;
//    }
//
//    public void setModel(C model) {
//        this.model = model;
//    }
//
//    public C getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(C engineVolume) {
//        this.engineVolume = engineVolume;
//    }
}

