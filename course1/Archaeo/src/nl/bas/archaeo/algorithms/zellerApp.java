package nl.bas.archaeo.algorithms;

import java.time.LocalDate;

public class zellerApp {

    public static void main(String[] args) {

        String dayOfBirth = null;

        LocalDate myBirthday = LocalDate.of(1976, 2, 27);

        int years = myBirthday.getYear() %100;
        int century = myBirthday.getYear() /100;
        int month = myBirthday.getMonth().getValue();
        int dayOfMonth = myBirthday.getDayOfMonth();


        if (month == 1){
            month = 13;
            years--;
        }

        if (month == 2){
            month = 14;
            years--;
        }

        month -= 2;


      int result = (dayOfMonth + (13 * month -1) / 5 + years + years / 4 + century / 4 + 5 * century) %7;



      if (result == 0){
            dayOfBirth = "zondag";

        }

        if (result == 1){
            dayOfBirth = "maandag";

        }
        if (result == 2){
            dayOfBirth = "dinsdag";

        }
        if (result == 3){
            dayOfBirth = "woensdag";

        }
        if (result == 4){
            dayOfBirth = "donderdag";

        }
        if (result == 5){
            dayOfBirth = "vrijdag";

        }
        if (result == 6){
            dayOfBirth = "zaterdag";

        }

      System.out.println(dayOfBirth);



    }
}
