package transport;

public class DriverC<C extends Driver, T extends Truck> {
    private char licenseType;

    public DriverC(char licenseType) {
        this.licenseType = licenseType;
    }


    public void canDrive(C Driver, T Truck) {

        if (getLicenseType()=='C') {
            System.out.println("Водитель "+ Driver.getDriverName()+" управляет автомобилем "+Truck.getBrand()+
                    " "+Truck.getModel()+" и \n" +
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

