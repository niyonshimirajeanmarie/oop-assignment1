package RailwayReservationsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source Station: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination Station: ");
        String dest = sc.nextLine();

        RailwaySystem rs = new RailwaySystem();

        rs.searchTrain(source, dest)
                .checkAvailability("Train001", 2)
                .addPassenger("John", 25, "Male")
                .calculateFare("Train001", 2)
                .bookTicket("PNR123", 200)
                .cancelTicket("PNR123");
    }
}