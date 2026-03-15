package auca.Exercise;

public class DetermineLoanEligibility {
    public static void main(String[] args) {
        int age = 25;
        int salary = 500000;
        int creditScore = 700;

        if(age > 21 && salary > 300000 && creditScore > 650)
            System.out.println("Eligible for loan");
        else
            System.out.println("Not eligible for loan");
    }
}
