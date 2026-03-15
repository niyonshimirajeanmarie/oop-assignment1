import java.util.Scanner;

public class BankTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the account number ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the account holder name");
        String name = sc.nextLine();

        System.out.println("enter your initial amount ");
        double initalamount = sc.nextDouble();

        // Check account status after initial amount
        double balance = sum(initalamount);

        System.out.println("enter the amount to deposit ");
        double money = sc.nextDouble();

        balance = deposite(money, balance);

        System.out.println("enter the withdraw money ");
        double witdr = sc.nextDouble();

        balance = withdrow(witdr, balance);

        loan(balance);
    }

    // Account becomes active if amount >= 5000
    public static double sum(double amount) {

        if (amount >= 5000) {
            System.out.println("Account is active ");
        } else {
            System.out.println("Insufficient amount ");
        }

        return amount;
    }

    public static double deposite(double depositeamount, double balance) {

        balance = balance + depositeamount;

        System.out.println("New balance after deposit: " + balance);

        if (balance >= 5000) {
            System.out.println("Account is active ");
        }

        return balance;
    }

    public static double withdrow(double withdrowamout, double balance) {

        double balanceafterwithdrow = balance - withdrowamout;

        if (balanceafterwithdrow < 5000) {
            System.out.println("insufficient balance");
        } else {
            System.out.println("Balance after withdraw: " + balanceafterwithdrow);
        }

        return balanceafterwithdrow;
    }

    public static double loan(double balance) {

        double loanallowed = balance * 15;
        double amountparmonth = loanallowed / 12;
        double installment = amountparmonth + (amountparmonth * 3 / 100);

        System.out.println("Loan allowed: " + loanallowed);
        System.out.println("Monthly installment: " + installment);

        return installment;
    }
}
