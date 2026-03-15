package auca.Exercise;

public class ConvertDaysToYearsMonthsDays {
    public static void main(String[] args) {
        int totalDays = 800;

        int years = totalDays / 365;
        totalDays %= 365;

        int months = totalDays / 30;
        int days = totalDays % 30;

        System.out.println(years + " Years " + months + " Months " + days + " Days");
    }
}
