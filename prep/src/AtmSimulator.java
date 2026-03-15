import java.util.Random;

public class AtmSimulator {

    private double balance = 500000;
    private double minWithdraw = 1000;
    private double dailyLimit = 300000;

    // ========================
    // CARD VALIDATION
    // ========================
    public AtmSimulator validateCard(String card, String pin) {

        if (card.trim().isEmpty()) {
            System.out.println("Card number cannot be empty!");
            return this;
        }

        if (!card.matches("\\d{16}")) {
            System.out.println("Card must contain exactly 16 digits!");
            return this;
        }

        if (pin.trim().isEmpty()) {
            System.out.println("PIN cannot be empty!");
            return this;
        }

        if (!pin.matches("\\d{4}")) {
            System.out.println("PIN must be exactly 4 digits!");
            return this;
        }

        System.out.println("Card validated successfully.");
        return this.checkCardSystem();
    }

    private AtmSimulator checkCardSystem() {
        System.out.println("Card verified in system.");
        return this;
    }

    // ========================
    // WITHDRAWAL
    // ========================
    public AtmSimulator withdraw(String acc, double amount) {

        if (acc.trim().isEmpty()) {
            System.out.println("Account number cannot be empty!");
            return this;
        }

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero!");
            return this;
        }

        return this.checkLimits(amount);
    }

    private AtmSimulator checkLimits(double amount) {

        if (amount < minWithdraw) {
            System.out.println("Amount below minimum withdrawal limit!");
            return this;
        }

        if (amount > dailyLimit) {
            System.out.println("Amount exceeds daily limit!");
            return this;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return this;
        }

        return this.updateBalance(amount);
    }

    private AtmSimulator updateBalance(double amount) {

        balance = balance - amount;
        System.out.println("Withdrawal successful!");

        return this.generateTransaction();
    }

    // ========================
    // TRANSACTION ID
    // ========================
    private AtmSimulator generateTransaction() {

        Random rand = new Random();
        int number = rand.nextInt(100000);
        String transactionID = "TXN" + number;

        System.out.println("Transaction ID: " + transactionID);

        return this.generateReceipt(transactionID);
    }

    // ========================
    // RECEIPT
    // ========================
    private AtmSimulator generateReceipt(String transactionID) {

        if (transactionID.trim().isEmpty()) {
            System.out.println("Invalid Transaction ID!");
            return this;
        }

        System.out.println("Receipt Generated Successfully.");
        return this;
    }

    // ========================
    // MINI STATEMENT
    // ========================
    public AtmSimulator miniStatement(String acc) {

        if (acc.trim().isEmpty()) {
            System.out.println("Account number cannot be empty!");
            return this;
        }

        System.out.println("Current Balance: " + balance);

        return this;
    }
}