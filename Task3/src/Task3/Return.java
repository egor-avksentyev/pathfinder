package Task3;

import java.sql.SQLOutput;

public class Return implements InterfaceTest {

   public String returnDayNameByNum(int numOfDay){

      String dayName = "" ;

       switch (numOfDay) {
           case 1:
               dayName = DaysOfWeek.MONDAY.getValue();
               break;
           case 2:
               dayName = DaysOfWeek.TUESDAY.getValue();
               break;
           case 3:
               dayName = DaysOfWeek.WEDNESDAY.getValue();
               break;
           case 4:
               dayName = DaysOfWeek.THURSDAY.getValue();
               break;
           case 5:
               dayName = DaysOfWeek.FRIDAY.getValue();
               break;
           case 6:
               dayName = DaysOfWeek.SATURDAY.getValue();
               break;
           case 7:
               dayName = DaysOfWeek.SUNDAY.getValue();
               break;
       }

return dayName;


    }



   public Integer  returnDayNumByName (String name){

       int dayNumber =  0 ;

       switch (name) {
           case "MONDAY":
               dayNumber = DaysOfWeek.MONDAY.getDayNumber();
               break;
           case "TUESDAY":
               dayNumber = DaysOfWeek.TUESDAY.getDayNumber();
               break;
           case "WEDNESDAY":
               dayNumber = DaysOfWeek.WEDNESDAY.getDayNumber();
               break;
           case "THURSDAY":
               dayNumber = DaysOfWeek.THURSDAY.getDayNumber();
               break;
           case "FRIDAY":
               dayNumber = DaysOfWeek.FRIDAY.getDayNumber();
               break;
           case "SATURDAY":
               dayNumber = DaysOfWeek.SATURDAY.getDayNumber();
               break;
           case "SUNDAY":
               dayNumber = DaysOfWeek.SUNDAY.getDayNumber();
               break;
       }

       return dayNumber;

    }

   public void  printPhrase (){

       String random = "Blyaaaaaaaat!!!!!!";

       System.out.println(random);

    }





}
