package Task3;

public abstract class Month {

    Month (int numOfMonth){
     }

    abstract void printPhrase ();

    public enum MonthsofYear {

        JANUARY("January "),
        FEBRUARY("February"),
        MARCH("March"),
        APRIL("April"),
        MAY("May"),
        JUNE("June"),
        JULY("July"),
        AUGUST("August"),
        SEPTEMBER("September"),
        OCTOBER("October"),
        NOVEMBER("November"),
        DECEMBER("December");


        private String monthName;


        MonthsofYear(String name) {
            this.monthName = name;

        }

        public String getMonthName() {
            return monthName;
        }
    }



        public String returnMonthByNum(int numOfMounth){

            String monthName = "" ;

            switch (numOfMounth) {
                case 1:
                    monthName = MonthsofYear.JANUARY.getMonthName();
                    break;
                case 2:
                    monthName = MonthsofYear.FEBRUARY.getMonthName();
                    break;
                case 3:
                    monthName = MonthsofYear.MARCH.getMonthName();
                    break;
                case 4:
                    monthName = MonthsofYear.APRIL.getMonthName();
                    break;
                case 5:
                    monthName = MonthsofYear.MAY.getMonthName();
                    break;
                case 6:
                    monthName = MonthsofYear.JUNE.getMonthName();
                    break;
                case 7:
                    monthName = MonthsofYear.JULY.getMonthName();
                    break;
                case 8:
                    monthName = MonthsofYear.AUGUST.getMonthName();
                    break;
                case 9:
                    monthName = MonthsofYear.SEPTEMBER.getMonthName();
                    break;
                case 10:
                    monthName = MonthsofYear.OCTOBER.getMonthName();
                    break;
                case 11:
                    monthName = MonthsofYear.NOVEMBER.getMonthName();
                    break;
                case 12:
                    monthName = MonthsofYear.DECEMBER.getMonthName();
                    break;
            }

            return monthName;


        }

     }














