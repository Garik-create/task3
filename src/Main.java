public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car();
        ladaGrande.brand = "Lada";
        ladaGrande.model = "Grande";
        ladaGrande.engineVolume = 1.7;
        ladaGrande.color = "Жёлтый";
        ladaGrande.productionYear = 2015;
        ladaGrande.productionCountry = "Россия";

        Car audiA850LTdiQuattro = new Car();
        audiA850LTdiQuattro.brand = "Audi";
        audiA850LTdiQuattro.model = "A8 50 L TDI quattro";
        audiA850LTdiQuattro.engineVolume = 3.0;
        audiA850LTdiQuattro.color = "Чёрный";
        audiA850LTdiQuattro.productionYear = 2020;
        audiA850LTdiQuattro.productionCountry = "Германия";

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.color = "Чёрный";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Германия";

        Car kiaSportage = new Car();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "4 поколение";
        kiaSportage.engineVolume = 2.4;
        kiaSportage.color = "Красный";
        kiaSportage.productionYear = 2018;
        kiaSportage.productionCountry = "Южная Корея";

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.color = "Оранжевый";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "Южная Корея";

        ladaGrande.printData();
        audiA850LTdiQuattro.printData();
        bmwZ8.printData();
        kiaSportage.printData();
        hyundaiAvante.printData();

    }
}
