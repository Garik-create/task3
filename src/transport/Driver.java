package transport;

public abstract class Driver<T extends Transport & Competing> {
    private String driverName;
    private boolean isLicensed;
    private int driverExperience;
    private T transport;

//    public void startMotion() {
//
//    }

//    public void finishMotion() {
//
//    }

    public Driver(String driverName, boolean isLicensed, int driverExperience, T transport) {
        if (driverName!=null && !driverName.isBlank()) {
            this.driverName = driverName;
        } else {
            this.driverName = "Информация отсутсвует.";
        }
        if (transport != null) {
            this.transport = transport;
        }
        setLicensed(isLicensed);
        setDriverExperience(driverExperience);
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public abstract void canDrive(T transport);
    public void fillTank() {

    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isLicensed() {
        return isLicensed;
    }

    public void setLicensed(boolean licensed) {
        isLicensed = licensed;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        if (driverExperience > 0) {
            this.driverExperience = driverExperience;
        } else {
            this.driverExperience = 0;
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", isLicensed=" + isLicensed +
                ", driverExperience=" + driverExperience +
                '}';
    }
}
