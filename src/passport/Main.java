package passport;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Passport passport1 = new Passport("1111111",
                "Ivanov",
                "Ivan",
                LocalDate.of(2000, 12, 30));

        Passport passport2 = new Passport("222222",
                "Petrov",
                "Pyotr",
                "Petrovich",
                LocalDate.of(1900,1,3));

        Passport passport3 = new Passport("222223",
                "Sidorov",
                "Sidr",
                "Sidorovich",
                LocalDate.of(1990,10,29));

        Passport.addPassport(passport1);
        Passport.addPassport(passport2);
        Passport.addPassport(passport3);


        System.out.println(Passport.getPassports());

        String passportToFind = "222222";

            Passport.findPassport(passportToFind, Passport.getPassports());
    }
}
