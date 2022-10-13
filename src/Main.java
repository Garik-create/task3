import transport.*;
//import transport.Train;


public class Main {
    public static void main(String[] args) {

        Car mersedes = new Car("Мерседес", "А101", 2.5);
        Car bmw = new Car("БМВ", "и102", 2.7);
        Car audi = new Car("Ауди", "ц103", 2.9);
        Car lamborgini = new Car("Ламборджини", "у104", 3);

        Truck volvo = new Truck("Вольво", "к201", 3);
        Truck kamaz = new Truck("Камаз", "е202", 3.5);
        Truck maz = new Truck("Маз", "н203", 3.7);
        Truck toyota = new Truck("Тойота", "г204", 4.5);

        var ikarus = new Bus("Икарус", "111", 2.5);
        var liaz = new Bus("Лиаз", "222", 2);
        var mersBus = new Bus("Мерседес", "333", 2.2);
        var mersBus2 = new Bus("Мерседес", "444", 2.7);

        Driver ivan = new Driver("Ivan", true, 10);
        Driver peter = new Driver("Peter", true, 5);
        Driver semen = new Driver("Semyon", true, 7);


        System.out.println();
        System.out.println(mersedes);
        mersedes.startMotion();
        mersedes.doPitStop();
        mersedes.finishMotion();
        System.out.println();
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(lamborgini);
        System.out.println();
        System.out.println(volvo);
        System.out.println(kamaz);
        System.out.println(maz);
        System.out.println(toyota);
        System.out.println();
        System.out.println(ikarus);
        System.out.println(liaz);
        System.out.println(mersBus);
        System.out.println(mersBus2);

        System.out.println();
        DriverB<Driver, Car> driverB = new DriverB<>('B');
        DriverC<Driver, Truck> driverC = new DriverC<>('C');
        DriverD<Driver, Bus> driverD = new DriverD<>('D');
        driverB.canDrive(ivan, mersedes);
        driverC.canDrive(peter,kamaz);
        driverD.canDrive(semen,ikarus);

        System.out.println();
        mersedes.foundCarBodyType("BDY_PICKUP");
        volvo.foundCarBodyType("BDY_N1");
        ikarus.foundCarBodyName("BDY_EXTRA_LARGE");

//        System.out.println("Driver "+DriverB.+);
//        System.out.println(mersBus2);

//        Car ladaGrande = new Car("Lada", "Grande", 1.7, "Жёлтый", 2015,
//                null, "Механика", "Седан", "е922ыв333", 4,
//                "Зима", new Car.Insurance(LocalDate.of(1988, 12, 11), 1000,
//                "123456789"),60,"petrol");
//
//        Car audiA850LTdiQuattro = new Car("Audi", "A8 50 L TDI quattro", 0, "Чёрный",
//                2020, "Германия", "автомат", "Хэтчбек", "е345нн333",
//                5, "лето", new Car.Insurance(LocalDate.of(2021, 12, 10),
//                10000, "987654321"), 70,"diesel");
//
//        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021,
//
//                "Германия", "робот", "универсал", "у999ке888",
//                3, "лто", new Car.Insurance(LocalDate.of(2022, 12, 11),
//                4000, "122345ff1"), 90, "batteries");
//
//        Car kiaSportage = new Car("Kia", "4 поколение", 2.4, "Красный", 0,
//                "Южная Корея", "полуавтомат", "лифтбек", "а444пр666",
//                8, "стужа", new Car.Insurance(LocalDate.of(2022, 10, 1),
//                2000, "1234567890"), 100, "petrol");
//
//
//        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый",
//                2016,
//                "Южная Корея", "вариатор", "минивэн", "у432ке456",
//                15, "Лето", new Car.Insurance(LocalDate.of(1999, 6, 2),
//                12000, "uytbyfert"), 200, "diesel");
//
//
//        ladaGrande.printData(ladaGrande.getWheels());
//        audiA850LTdiQuattro.printData(audiA850LTdiQuattro.getWheels());
//        bmwZ8.printData(bmwZ8.getWheels());
//        kiaSportage.printData(kiaSportage.getWheels());
//        hyundaiAvante.printData(hyundaiAvante.getWheels());
//        System.out.println();
//        System.out.println();
//
//
//        int temperature = 7;
//
//        ladaGrande.changeWheels(temperature, ladaGrande.getWheels());
//        audiA850LTdiQuattro.changeWheels(temperature, audiA850LTdiQuattro.getWheels());
//        bmwZ8.changeWheels(temperature, bmwZ8.getWheels());
//        kiaSportage.changeWheels(temperature, kiaSportage.getWheels());
//        hyundaiAvante.changeWheels(temperature, hyundaiAvante.getWheels());
//
//        ladaGrande.checkNumberTrue(ladaGrande.getNumber());
//        audiA850LTdiQuattro.checkNumberTrue(audiA850LTdiQuattro.getNumber());
//        bmwZ8.checkNumberTrue(bmwZ8.getNumber());
//        kiaSportage.checkNumberTrue(kiaSportage.getNumber());
//        hyundaiAvante.checkNumberTrue(hyundaiAvante.getNumber());
//
//        System.out.println();
//        Car.Insurance.checkInsuranceNumber(ladaGrande.getInsurance().getInsuranceNumber());
//        ladaGrande.getInsurance().checkInsuranceTerms(LocalDate.now());
//
//        System.out.println();
//        System.out.println("Наследование. Д.з.1 задание 2");
//
//        Train lastochka = new Train("Ласточка", "B-901", 2011, 301,
//                "России", "", 3500, 6, "Белорусского вокзала",
//                "Минск-Пассажирский", 11, "diesel");
//
//        var leningrad = new Train("Ленинград", "Д-125", 2019, 270,
//                "России",
//                "", 1700, 8, "Ленинградского вокзала",
//                "Ленинград-Пассажирский", 8, "diesel");
//
//        lastochka.printTrain();
//        leningrad.printTrain();
//
//        System.out.println();
//        System.out.println("Наследование. Д.з.1 задание 3");
//
//        var ikarus = new Bus("Икарус", "111", 1980, "Венгрии", "синего",
//                120, "diesel");
//
//        var liaz = new Bus("Лиаз", "222", 2000, "России", "красного",
//                150, "petrol");
//
//        var mersedes = new Bus("Мерседес", "333", 2020, "Германии",
//                "жёлтого",
//                180, "diesel");
//
//        ikarus.printBus();
//        liaz.printBus();
//        mersedes.printBus();
//
//        System.out.println();
//        System.out.println("Наследование. Д.з.2 задание 1");
//        ladaGrande.refill(ladaGrande.getFuel());
//        lastochka.refill(lastochka.getFuel());
//        mersedes.refill(mersedes.getFuel());
//
//        ladaGrande.printData2();
//        audiA850LTdiQuattro.printData2();
//        bmwZ8.printData2();
//        kiaSportage.printData2();
//        hyundaiAvante.printData2();
//
//        lastochka.printData2();
//        leningrad.printData2();
//
//        ikarus.printData2();
//        liaz.printData2();
//        mersedes.printData2();
    }


}
