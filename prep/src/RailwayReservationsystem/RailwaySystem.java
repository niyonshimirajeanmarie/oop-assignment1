package RailwayReservationsystem;

public class RailwaySystem {

    public RailwaySystem searchTrain(String source, String dest) {
        if(source.trim().isEmpty()) System.out.println("Source invalid!");
        if(dest.trim().isEmpty()) System.out.println("Destination invalid!");
        System.out.println("Train search completed.");
        return this;
    }

    public RailwaySystem checkAvailability(String trainNo, int passengers) {
        if(trainNo.trim().isEmpty()) System.out.println("Train number invalid!");
        if(passengers<=0) System.out.println("Passenger count invalid!");
        System.out.println("Availability checked.");
        return this;
    }

    public RailwaySystem addPassenger(String name, int age, String gender) {
        if(name.trim().isEmpty()) System.out.println("Passenger name invalid!");
        if(age<=0) System.out.println("Age invalid!");
        if(gender.trim().isEmpty()) System.out.println("Gender invalid!");
        System.out.println("Passenger added.");
        return this;
    }

    public RailwaySystem calculateFare(String trainNo, int passengers) {
        System.out.println("Fare calculated for " + passengers + " passengers.");
        return this;
    }

    public RailwaySystem bookTicket(String pnr, double amount) {
        if(pnr.trim().isEmpty()) System.out.println("PNR invalid!");
        if(amount<=0) System.out.println("Amount invalid!");
        System.out.println("Ticket booked successfully.");
        return this;
    }

    public RailwaySystem cancelTicket(String pnr) {
        if(pnr.trim().isEmpty()) System.out.println("PNR invalid!");
        System.out.println("Ticket cancelled successfully.");
        return this;
    }
}
