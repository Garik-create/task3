package transport;

import java.util.ArrayList;
import java.util.Objects;


public class Mechanic<T extends Transport> {
    private String mechanicName;
    private String companyName;
    private String canService;

    public Mechanic(String mechanicName, String companyName, String canService) {
        if (mechanicName != null && !mechanicName.isEmpty() && !mechanicName.isBlank()) {
            this.mechanicName = mechanicName;
        } else {
            this.mechanicName = "Имя не указано.";
            System.out.println("Укажите имя механика.");

        }
        if (companyName != null && !companyName.isEmpty() && !companyName.isBlank()) {
            this.companyName = companyName;
        } else {
            this.companyName = "Название крмпании не указано.";
            System.out.println("Укажите название компании.");
        }
        if (canService != null && !canService.isEmpty() && !canService.isBlank()) {
            this.canService = canService;
        } else {
            System.out.println("Укажите, с каким видом транспорта может работать механик.");
        }



    }

//    public ArrayList<C> getCarsInService() {
//        return carsInService;
//    }



    public boolean service(T t) {
        return false;
    }

    public void doMaintenance() {
        System.out.println("Загнать машину на подъёмник, проверить подвеску.");
        System.out.println("Проверить подвеску тормозные колодки.");
        System.out.println("Заменить масло.");
    }

    public void doRepair() {
        System.out.println("Провести диагностику.");
        System.out.println("Взять запчасть со склада.");
        System.out.println("Заменить сломанную деталь.");

    }

    public String getMechanicName() {
        if (mechanicName == null || mechanicName.isEmpty() || mechanicName.isBlank()) {
            this.mechanicName = "Имя не указано.";
        }
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {

        if (getMechanicName().equals("Имя не указано.")) {
            this.mechanicName = mechanicName;
        } else {
            System.out.println("Имя механика уже указано.");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName != null && !companyName.isEmpty() && !companyName.isBlank()) {
            this.companyName = companyName;
        } else {
            System.out.println("Укажите название компании.");

        }
    }

    public String getCanService() {
        return canService;
    }

    public void setCanService(String canService) {
        this.canService = canService;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "mechanicName='" + mechanicName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", canService='" + canService + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(getMechanicName(), mechanic.getMechanicName()) && Objects.equals(getCompanyName(), mechanic.getCompanyName()) && Objects.equals(getCanService(), mechanic.getCanService());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
