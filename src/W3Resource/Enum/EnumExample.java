package W3Resource.Enum;

public class EnumExample {
    public enum Months{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }

    public static void main(String[] args) {
        Months currentMonth = Months.MARCH;
        System.out.println("current month is : "+currentMonth);
    }
}
