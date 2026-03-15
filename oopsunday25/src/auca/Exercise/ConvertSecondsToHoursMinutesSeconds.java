package auca.Exercise;

public class ConvertSecondsToHoursMinutesSeconds {
    public static void main(String[] args) {
        int totalSeconds = 3675;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}
