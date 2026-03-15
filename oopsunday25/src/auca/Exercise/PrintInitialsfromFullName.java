package auca.Exercise;

public class PrintInitialsfromFullName {
    public static void main(String[] args) {
        String fullName = "Jean Marie Niyonshimira";
        String[] parts = fullName.split(" ");

        System.out.print("Initials: ");
        for(String p : parts) {
            System.out.print(p.charAt(0) + " ");
        }
    }
}
