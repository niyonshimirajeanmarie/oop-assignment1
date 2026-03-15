package _27197;

public class TaxCalculate {

    public static double balance;
    public double income;
    public double turnoveramount;
    public double VAT;
    public double PAYE;
    public double withholdingtax;
    public double incometax;
    public double rentaltax;
    public double pensioncontribution;
    public double maternitycontibution;
    public double insurancepremium;
    public double medicalcontribution;

    public double calculateturnover() {

        turnoveramount = 0.118;
        balance = income * turnoveramount;

        System.out.println("Initial turnover balance = " + balance);

        if (balance < 2000000) {

            System.out.println("Small category business.");
        }
        else if (balance <= 10000000) {

            calculatevat();
            calculatepaye();
            calculatewithholdingtax();
            calculateincometax();
            calculaterentaltax();
            calculatepensioncontribution();
        }
        else {

            calculatepensioncontribution();
            calculatevat();
            calculateincometax();
            calculatepaye();
            calculaterentaltax();
            calculateinsurancepremium();
            calculatematernitycontribution();
            calculatemedicalcontribution();
            calculatewithholdingtax();
        }

        return balance;
    }

    public double calculatevat() {
        VAT = 0.5;
        balance = balance * VAT;
        System.out.println("VAT = " + balance);
        return balance;
    }

    public double calculatepaye() {
        PAYE = 0.04;
        balance = balance * PAYE;
        System.out.println("PAYE = " + balance);
        return balance;
    }

    public double calculatewithholdingtax() {
        withholdingtax = 0.3;
        balance = balance * withholdingtax;
        System.out.println("Withholding tax = " + balance);
        return balance;
    }

    public double calculateincometax() {
        incometax = 0.5;
        balance = balance * incometax;
        System.out.println("Income tax = " + balance);
        return balance;
    }

    public double calculaterentaltax() {
        rentaltax = 0.2;
        balance = balance * rentaltax;
        System.out.println("Rental tax = " + balance);
        return balance;
    }

    public double calculatepensioncontribution() {
        pensioncontribution = 0.3;
        balance = balance * pensioncontribution;
        System.out.println("Pension contribution = " + balance);
        return balance;
    }

    public double calculatematernitycontribution() {
        maternitycontibution = 0.1;
        balance = balance * maternitycontibution;
        System.out.println("Maternity contribution = " + balance);
        return balance;
    }

    public double calculatemedicalcontribution() {
        medicalcontribution = 0.2;
        balance = balance * medicalcontribution;
        System.out.println("Medical contribution = " + balance);
        return balance;
    }

    public double calculateinsurancepremium() {
        insurancepremium = 0.4;
        balance = balance * insurancepremium;
        System.out.println("Insurance premium = " + balance);
        return balance;
    }
}