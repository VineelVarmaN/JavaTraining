package W3Resource.basic_part1;

public class ConvertSecondsToHours {
    public static void main(String[] args) {
        int totalSeconds = 86399;
        //convert seconds to hours, minutes and seconds by division
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600)/60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
