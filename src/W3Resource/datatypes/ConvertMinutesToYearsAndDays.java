package W3Resource.datatypes;

public class ConvertMinutesToYearsAndDays {
    public static void getConvertedYears(int minutes){
        int years = 0;
        int remainingDays = 0;
        //convert the minutes into days
        int totalDays = minutes/(60*24);
        System.out.println(totalDays);
        //get the years from days
//        for (int i = 365; i<totalDays && i>=365; i++){
//            if (totalDays)
//            years++;
//        }
        while (totalDays>=365){
            totalDays-=365;
            years++;
            remainingDays = totalDays;

        }
        System.out.println("years "+years+" and Days "+remainingDays);
    }

    public static void main(String[] args) {
        int minutes = 3456789;
        getConvertedYears(minutes);
    }
}
