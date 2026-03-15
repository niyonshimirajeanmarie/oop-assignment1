package auca.Exercise;

public class DetermineElectricityBillBasedOnUnits {
    public static void main(String[] args) {
        int units = 250;
        double bill = 0;

        if(units <= 100) bill = units * 1.5;
        else if(units <= 200) bill = 100 * 1.5 + (units - 100) * 2;
        else bill = 100 * 1.5 + 100 * 2 + (units - 200) * 3;

        System.out.println("Electricity Bill: " + bill);
    }
}
