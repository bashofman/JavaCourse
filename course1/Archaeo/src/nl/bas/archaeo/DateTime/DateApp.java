package nl.bas.archaeo.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateApp {

    public static void main(String[] args) {
        demoDate();
        demoTime();

    }


    public static void demoDate() {

        LocalDate today = LocalDate.now();

        LocalDate myBirthday = LocalDate.of(1976, 2, 27);

        LocalDate birthdayMees = LocalDate.of(2009, 1, 18);

        LocalDate birthdayStan = LocalDate.of(2010, 5, 7);

        LocalDate birthdayNino = LocalDate.of(2013, 8, 5);


        System.out.println(myBirthday);

        Period period = Period.between(myBirthday, today);

        System.out.println(period);

        long dagenOpAarde = ChronoUnit.DAYS.between(myBirthday, today);
        System.out.println(dagenOpAarde);

        long maandenOpAaarde = ChronoUnit.MONTHS.between(myBirthday, today);
        System.out.println(maandenOpAaarde);

        long dagenMeesNino = ChronoUnit.DAYS.between(birthdayMees, birthdayNino);
        System.out.println(dagenMeesNino);

        long dagenStanNino = ChronoUnit.DAYS.between(birthdayStan, birthdayNino);
        System.out.println(dagenStanNino);

    }

    public static void demoTime() {

        LocalDateTime vertrek = LocalDateTime.of(2019, 7, 28, 7, 28);
        LocalDateTime aankomst = LocalDateTime.of(2019, 9, 10, 12, 30);

        long minutes = ChronoUnit.MINUTES.between(vertrek, aankomst);

        System.out.println(aankomst.plusMinutes(minutes).getDayOfWeek());


    }

}
