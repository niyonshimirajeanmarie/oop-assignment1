package HospitalmanagementSysytem;

public class HospitalSystem {

    public HospitalSystem registerPatient(String name, int age, String gender) {
        // Check if name is empty
        if(name.trim().isEmpty()) {
            System.out.println("Patient name cannot be empty!");
        }
        // Check if name is only numbers
        else if(name.matches("\\d+")) {
            System.out.println("Patient name cannot be a number!");
        }
        else {
            System.out.println("Patient name is valid: " + name);
        }

        // Age validation
        if(age <= 0) {
            System.out.println("Age must be greater than zero!");
        }

        // Gender validation
        if(gender.trim().isEmpty()) {
            System.out.println("Gender invalid!");
        }

        System.out.println("Patient registered successfully.");
        return this;  // For method chaining
    }

    public HospitalSystem recordVitals(double temp, int bpSys, int bpDia) {
        System.out.println("Vitals recorded. Temp: "+temp+" BP: "+bpSys+"/"+bpDia);
        return this;
    }

    public HospitalSystem assignDoctor(String department) {
        if(department.trim().isEmpty()) System.out.println("Department invalid!");
        System.out.println("Doctor assigned.");
        return this;
    }

    public HospitalSystem diagnosis(String symptoms) {
        if(symptoms.trim().isEmpty()) System.out.println("Symptoms invalid!");
        System.out.println("Diagnosis completed.");
        return this;
    }

    public HospitalSystem prescription(String advice) {
        if(advice.trim().isEmpty()) System.out.println("Prescription invalid!");
        System.out.println("Prescription given.");
        return this;
    }

    public HospitalSystem billing(double amount) {
        if(amount <=0) System.out.println("Billing amount invalid!");
        System.out.println("Billing completed: " + amount);
        return this;
    }
}
