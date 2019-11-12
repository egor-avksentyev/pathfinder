package Task3;

public enum DaysOfWeek {

    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7);

    private String value;
    private Integer dayNumber;


    DaysOfWeek(String name , int number) {
            this.value = name;
            this.dayNumber = number;

    }

    public String getValue() {
        return value;
    }

    public Integer getDayNumber() {
        return dayNumber;
    }


}
