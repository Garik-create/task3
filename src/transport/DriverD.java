package transport;

public class DriverD<D extends Driver, B extends Bus> {
    private char licenseType;

    public DriverD(char licenseType) {
        this.licenseType = licenseType;
    }


    public void canDrive(D Driver, B Bus) {

        if (getLicenseType()=='D') {
            System.out.println("Водитель "+ Driver.getDriverName()+" управляет автомобилем "+Bus.getBrand()+
                    " "+Bus.getModel()+" и \n" +
                    "будет участвовать в заезде.");
        } else {
            System.out.println("Водитель "+Driver.getDriverName()+" не участвует в заезде.");
        }
    }

    public char getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(char licenseType) {
        this.licenseType = licenseType;
    }
}
