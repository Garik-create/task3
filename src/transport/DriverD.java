package transport;

public class DriverD extends Driver<Bus> {
    private char licenseType;

    public DriverD(char licenseType, boolean isLicensed, String driverName, int driverExperience, Bus transport) {
        super(driverName, isLicensed, driverExperience, transport);
        this.licenseType = licenseType;
    }

    @Override
    public void canDrive(Bus transport) {
        if (getLicenseType() == 'D') {
            System.out.println("Водитель " + getDriverName() + " управляет автомобилем " + transport.getBrand() +
                    " " + getTransport().getModel() + " и \n" +
                    "будет участвовать в заезде.");
        } else {
            System.out.println("Водитель " + getDriverName() + " не участвует в заезде.");
        }
    }

    public char getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(char licenseType) {
        this.licenseType = licenseType;
    }
}
