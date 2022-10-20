package transport;

public class DriverC extends Driver<Truck> {
    private char licenseType;


    public DriverC(String driverName, char licenseType, boolean isLicensed, int driverExperience, Truck transport) {
        super(driverName,isLicensed,driverExperience,transport);
        this.licenseType = licenseType;
    }


    private char getLicenseType() {
        return licenseType;
    }

    @Override
    public void canDrive(Truck transport) {
        if (getLicenseType() == 'C') {
            System.out.println("Водитель " + getDriverName() + " управляет автомобилем " + transport.getBrand() +
                    " " + transport.getModel() + " и \n" +
                    "будет участвовать в заезде.");
        } else {
            System.out.println("Водитель " + getDriverName() + " не участвует в заезде.");
        }
    }

    public void setLicenseType(char licenseType) {
        this.licenseType = licenseType;
    }
}

