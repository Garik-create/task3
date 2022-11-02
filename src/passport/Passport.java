package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private String passportNumber;
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate dateOfBirth;

    private static Set<Passport> passports;


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
        passports = new HashSet<>();
    }




    public static void addPassport(Passport passport, Set<Passport> passports) {
        if (passports.size() == 0) {
            passports.add(passport);
        } else {
//            List<>
            for (Passport value : passports) {
                if (value.getPassportNumber().equals(passport.getPassportNumber())) {
                value.setLastName(passport.getLastName());
                value.setFirstName(passport.getFirstName());
                value.setPatronymic(passport.getPatronymic());
                value.setDateOfBirth(passport.getDateOfBirth());
                passports.add(passport);
                } else {
                passports.add(passport);
            }
            }

        }

    }

    public static Set<Passport> getPassports() {
        return passports;
    }

    @Override
    public String toString() {
        return "Пасспорт номер " + passportNumber + ", Фамилия " + lastName +
                ", Имя " + firstName + ", отчество " + patronymic +
                ", дата рождения: " + dateOfBirth+";\n";
    }



    public String getPassportNumber() {
        return passportNumber;
    }

  /*  public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }*/

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

    public static void setPassport(Passport passport) {
        passports.add(passport);
    }
}
