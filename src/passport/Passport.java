package passport;

import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.time.LocalDate;
import java.util.*;

public class Passport {
    private String passportNumber;
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate dateOfBirth;

    private static Map<String, Passport> passports;


    public Passport(String passportNumber, String lastName, String firstName, LocalDate dateOfBirth) {
        this(passportNumber, lastName, firstName, null, dateOfBirth);

    }

    public Passport(String passportNumber,
                    String lastName,
                    String firstName,
                    String patronymic,
                    LocalDate dateOfBirth) {
        if (passportNumber != null && !passportNumber.isBlank()) {
            this.passportNumber = passportNumber;
        } else {
            this.passportNumber = "000000";
        }
        setLastName(lastName);
        setFirstName(firstName);
        setPatronymic(patronymic);
        setDateOfBirth(dateOfBirth);
        passports = new HashMap<>();
    }


    public static void findPassport(String number, Map<String, Passport> passports) {
        if (passports.containsKey(number)) {
            System.out.printf("Пасспорт с номером " + number + " найден: \n" + passports.get(number));
            return;
        }
        System.out.println("null");
    }

    public static void addPassport(Passport passport) {
        passports.put(passport.getPassportNumber(),passport);
    }

//    public static void addPassport(String number, Map<String, Passport> passports) {
//        if (passports.isEmpty()) {
//            passports.put(number,passports.);
//        } else if (passports.contains(passport)) {
//            for (Passport value : passports) {
//                if (value.getPassportNumber().equals(passport.getPassportNumber())) {
//                    passports.remove(passport);
//                    passports.add(passport);
//                    return;
//                }
//            }
//        } else {
//            passports.add(passport);
//        }
//
//
//    }


    public static Map<String, Passport> getPassports() {
        return passports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return getPassportNumber().equals(passport.getPassportNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassportNumber());
    }

    @Override
    public String toString() {
        return "Пасспорт номер " + passportNumber + ", Фамилия " + lastName +
                ", Имя " + firstName + ", отчество " + patronymic +
                ", дата рождения: " + dateOfBirth + ";\n";
    }


    public String getPassportNumber() {
        return passportNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isBlank()) {
            this.lastName = lastName;
        } else {
            System.out.println("Укажите фамилию!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isBlank()) {
            this.firstName = firstName;
        } else {
            System.out.println("Укажите имя!");
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth != null && !dateOfBirth.isAfter(LocalDate.now())) {
            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("Введите корректную дату рождения!");
        }
    }
}
