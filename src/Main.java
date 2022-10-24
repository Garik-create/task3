import transport.*;

import java.util.IdentityHashMap;
import java.util.Random;
//import transport.Train;


public class Main {
    public static void main(String[] args) {

        Car mersedes = new Car("Мерседес", "А101", 2.5,false);
        Car bmw = new Car("БМВ", "и102", 2.7,false);
        Car audi = new Car("Ауди", "ц103", 2.9,true);
        Car lamborgini = new Car("Ламборджини", "у104", 3, false);

        Truck volvo = new Truck("Вольво", "к201", 3, false);
        Truck kamaz = new Truck("Камаз", "е202", 3.5, false);
        Truck maz = new Truck("Маз", "н203", 3.7, false);
        Truck toyota = new Truck("Тойота", "г204", 4.5,true);

        var ikarus = new Bus("Икарус", "111", 2.5);
        var liaz = new Bus("Лиаз", "222", 2);
        var mersBus = new Bus("Мерседес", "333", 2.2);
        var mersBus2 = new Bus("Мерседес", "444", 2.7);

        DriverB ivan = new DriverB('B', "Ivan", true, 10, bmw);
        DriverB alex = new DriverB('B', "Alex", true, 15, audi);
//        DriverB igor = new DriverB('B', "Igor", true, 20, mersedes);
        DriverB andrey = new DriverB('B', "Andrey", true, 12, lamborgini);
        DriverC peter = new DriverC("Peter", 'C', true, 5,maz);
        DriverC vasya = new DriverC("Vasiliy", 'C', true, 5,kamaz);
        DriverC dima = new DriverC("Dmitriy", 'C', true, 7,volvo);
        DriverC serg = new DriverC("Sergey", 'C', true, 9,toyota);
        DriverD semen = new DriverD('D', true, "Semyon",7,liaz);
        DriverD zhenya = new DriverD('D', true, "Evgeny",25,ikarus);
        DriverD max = new DriverD('D', true, "Max",11,mersBus);
        DriverD kostya = new DriverD('D', true, "Konstantin",7,mersBus2);


        System.out.println();
        System.out.println(mersedes);
        mersedes.passDiagnostics();
//        mersedes.startMotion();
//        mersedes.doPitStop();
//        mersedes.finishMotion();
//        System.out.println();
        System.out.println(bmw);
        mersedes.passDiagnostics();
        System.out.println(audi);
        audi.passDiagnostics();
        System.out.println(lamborgini);
        lamborgini.passDiagnostics();
        System.out.println();
        System.out.println(volvo);
        volvo.passDiagnostics();
        System.out.println(kamaz);
        kamaz.passDiagnostics();
        System.out.println(maz);
        maz.passDiagnostics();
        System.out.println(toyota);
        toyota.passDiagnostics();
        System.out.println();
        System.out.println(ikarus);
        ikarus.passDiagnostics();
        System.out.println(liaz);
        liaz.passDiagnostics();
        System.out.println(mersBus);
        mersBus.passDiagnostics();
        System.out.println(mersBus2);
        mersBus2.passDiagnostics();

        System.out.println();
        ivan.canDrive(audi);
        ivan.getMessage();
        System.out.println();
        peter.canDrive(kamaz);
        peter.getMessage();
        System.out.println();
        semen.canDrive(mersBus);
        semen.getMessage();
        System.out.println();

        Transport.getCompetitors().add(mersedes);
        Transport.getCompetitors().add(bmw);
        Transport.getCompetitors().add(audi);
        Transport.getCompetitors().add(lamborgini);
        Transport.getCompetitors().add(volvo);
        Transport.getCompetitors().add(kamaz);
        Transport.getCompetitors().add(maz);
        Transport.getCompetitors().add(toyota);
        Transport.getCompetitors().add(ikarus);
        Transport.getCompetitors().add(liaz);
        Transport.getCompetitors().add(mersBus);
        Transport.getCompetitors().add(mersBus2);

        for (int i = 0; i < Transport.getCompetitors().size(); i++) {
            System.out.println(Transport.getCompetitors().get(i).getBrand() +" "+
                    Transport.getCompetitors().get(i).getModel()+" участвует в заезде.");
        }




        Mechanic<Car> den = new Mechanic<>("Den", "Service company two", "Cars");
        Mechanic<Transport> bob = new Mechanic<>("Bob", "Service company one", "All");
        Mechanic<Truck> mask = new Mechanic<>("Mask", "Service company three", "Trucks");
        Mechanic<Bus> henry = new Mechanic<>("Henry", "Service company one", "Buses");

        Sponsor sponsor1 = new Sponsor("Sponsor one", 1_000_000);
        Sponsor sponsor2 = new Sponsor("Sponsor two", 2_000_000);
        Sponsor sponsor3 = new Sponsor("Sponsor three", 3_000_000);
        Sponsor sponsor4 = new Sponsor("Sponsor four", 4_000_000);



        mersedes.getSponsors().add(sponsor1);
        mersedes.getSponsors().add(sponsor2);
        mersedes.getDrivers().add(den);
        mersedes.getDrivers().add(igor);
        bmw.getSponsors().add(sponsor2);
        bmw.getSponsors().add(sponsor3);
        audi.getSponsors().add(sponsor3);
        audi.getSponsors().add(sponsor4);
        lamborgini.getSponsors().add(sponsor4);
        volvo.getSponsors().add(sponsor1);
        kamaz.getSponsors().add(sponsor2);
        maz.getSponsors().add(sponsor3);
        toyota.getSponsors().add(sponsor4);
        ikarus.getSponsors().add(sponsor1);
        liaz.getSponsors().add(sponsor2);
        mersBus.getSponsors().add(sponsor3);
        mersBus2.getSponsors().add(sponsor4);

//        bob.getTransportsInService().add(ikarus);
//        bob.getTransportsInService().add(mersedes);
//        bob.getTransportsInService().add(volvo);
//        den.getTransportsInService().add(mersedes);
//        den.getTransportsInService().add(audi);
//        den.getTransportsInService().add(bmw);
//        den.getTransportsInService().add(lamborgini);
//        mask.getTransportsInService().add(volvo);
//        mask.getTransportsInService().add(kamaz);
//        mask.getTransportsInService().add(maz);
//        mask.getTransportsInService().add(toyota);
//        henry.getTransportsInService().add(ikarus);
//        henry.getTransportsInService().add(liaz);
//        henry.getTransportsInService().add(mersBus);
//        henry.getTransportsInService().add(mersBus2);

//        mersedes.getDrivers().add(igor);

//        System.out.println(mersedes.getSponsors() + mersedes.);

//        System.out.println("mersedes = " + mersedes.getSponsors() + mersedes.);


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
