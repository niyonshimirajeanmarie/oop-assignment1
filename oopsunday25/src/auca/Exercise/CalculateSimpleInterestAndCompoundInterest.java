package auca.Exercise;

public class CalculateSimpleInterestAndCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5; // percent
        double time = 2; // years

        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
