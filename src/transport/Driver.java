package transport;

public class Driver {
    private String driverName;
    private boolean isLicensed;
    private int driverExperience;

//    public void startMotion() {
//
//    }

//    public void finishMotion() {
//
//    }

    public Driver(String driverName, boolean isLicensed, int driverExperience) {
        if (driverName!=null && !driverName.isBlank()) {
            this.driverName = driverName;
        } else {
            this.driverName = "Информация отсутсвует.";
        }
        setLicensed(isLicensed);
        setDriverExperience(driverExperience);
    }

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
