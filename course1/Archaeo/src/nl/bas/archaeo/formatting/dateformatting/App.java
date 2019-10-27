package nl.bas.archaeo.formatting.dateformatting;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = now.format(dateTimeFormatter);

        System.out.println(formattedDateTime);


        LocalDateTime myBirthday = LocalDateTime.of(LocalDate.of(1976, 2, 27), LocalTime.of(19,05,32));

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myBirthday.format(dateFormatter);

        System.out.println(formattedDate);
    }
}
