import bk.bkbusiness.Business;
import bk.bkloan.Loan;
import bk.bkpayment.Payment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the payment");
        double paymentamount= sc.nextDouble();

        Payment j=new Payment();
        if (paymentamount<50000){
            j.cancelpayment();

        }


        //int loan= sc.nextInt();
        //double loanamount= sc.nextDouble();
        //double loaninterest= sc.nextDouble();
        //ouble rate= sc.nextDouble();
        //Loan j=new Loan(loan,loanamount,loaninterest,rate );



    }
    }