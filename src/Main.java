public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada","Grande",1.7,"Жёлтый",2015,
                "Россия");

        Car audiA850LTdiQuattro = new Car("Audi","A8 50 L TDI quattro",3.0,"Чёрный",
                2020,"Германия");

        Car bmwZ8 = new Car("BMW","Z8",3.0,"Чёрный",2021,

                "Германия");
        Car kiaSportage = new Car("Kia","4 поколение", 2.4,"Красный",2018,
                "Южная Корея");


        Car hyundaiAvante = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,
                "Южная Корея");


        ladaGrande.printData();
        audiA850LTdiQuattro.printData();
        bmwZ8.printData();
        kiaSportage.printData();
        hyundaiAvante.printData();

    }
}
