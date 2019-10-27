package nl.bas.archaeo.DateTime;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Date {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate myBirthday = LocalDate.of(1976, 2, 27);

        LocalDate birthdayMees = LocalDate.of(2009,1,18);

        LocalDate birthdayStan = LocalDate.of(2010,5,7);

        LocalDate birthdayNino = LocalDate.of(2013,8,5);


        System.out.println(myBirthday);

        Period period = Period.between(myBirthday, today);

        System.out.println(period);

        long dagenOpAarde = ChronoUnit.DAYS.between(myBirthday, today);
        System.out.println(dagenOpAarde);

        long maandenOpAaarde = ChronoUnit.MONTHS.between(myBirthday, today);
        System.out.println(maandenOpAaarde);

        long secondenOpAarde = ChronoUnit.SECONDS.between(myBirthday, today);
        System.out.println(secondenOpAarde);

        long secondenMeesNino = ChronoUnit.SECONDS.between(birthdayMees, birthdayNino);
        System.out.println(secondenMeesNino);

        long dagenStanNino = ChronoUnit.DAYS.between(birthdayStan, birthdayNino);
        System.out.println(dagenStanNino);

    }
}
