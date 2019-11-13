package Task3;

/**
Enum with days of week
 */
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

    /**
     * Constructor DaysOfWeek
     *
     * @param name   the name of day of week
     * @param number the number of exact day of week
     * */
    DaysOfWeek(String name, int number) {
        this.value     = name;
        this.dayNumber = number;
    }

    /**
     * GetValue method that returns value
     *
     * @return the name of day of week
     * */
    public String getValue() {
        return value;
    }

    /**
     * GetDayNumber method that returns daynumber
     * @return the number of day
     * */
    public Integer getDayNumber() {
        return dayNumber;
    }


}
