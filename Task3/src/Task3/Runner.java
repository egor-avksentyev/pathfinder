package Task3;

public class Runner {
    public static void main(String[] args) {

        ClassInherit  ClassInheritTest = new ClassInherit(1);
        Return Return = new Return ();

System.out.println(Return.returnDayNameByNum(1));
System.out.println(Return.returnDayNumByName("MONDAY"));
System.out.println(ClassInheritTest.returnMonthByNum(2));

  ClassInheritTest.printPhrase();
   Return.printPhrase();

    }

}
