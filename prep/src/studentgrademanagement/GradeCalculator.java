package studentgrademanagement;

public class GradeCalculator {

    private double total;
    private double average;
    private double percentage;
    private String grade;
    private boolean isPass;

    private int subjectCount = 2;
    private double maxMarks = 100;

    // =========================
    // STUDENT VALIDATION
    // =========================
    public GradeCalculator validateStudent(String name, int roll, String className) {

        if (name.trim().isEmpty()) {
            System.out.println("Student name cannot be empty!");
            return this;
        }

        if (roll <= 0) {
            System.out.println("Roll number must be greater than zero!");
            return this;
        }

        if (className.trim().isEmpty()) {
            System.out.println("Class name cannot be empty!");
            return this;
        }

        System.out.println("Student information validated.");
        return this;
    }

    // =========================
    // MARKS VALIDATION
    // =========================
    public GradeCalculator validateMarks(String subject, double marks) {

        if (subject.trim().isEmpty()) {
            System.out.println("Subject name cannot be empty!");
            return this;
        }

        if (marks < 0) {
            System.out.println("Marks cannot be negative!");
            return this;
        }

        if (marks > maxMarks) {
            System.out.println("Marks cannot exceed 100!");
            return this;
        }

        System.out.println(subject + " marks validated.");
        return this;
    }

    // =========================
    // TOTAL CALCULATION
    // =========================
    public GradeCalculator calculateTotal(double m1, double m2) {

        total = m1 + m2;

        if (total < 0) {
            System.out.println("Total cannot be negative!");
            return this;
        }

        return this.calculateAverage();
    }

    // =========================
    // AVERAGE
    // =========================
    private GradeCalculator calculateAverage() {

        if (subjectCount <= 0) {
            System.out.println("Invalid number of subjects!");
            return this;
        }

        average = total / subjectCount;

        return this.calculatePercentage();
    }

    // =========================
    // PERCENTAGE
    // =========================
    private GradeCalculator calculatePercentage() {

        percentage = (total / (subjectCount * maxMarks)) * 100;

        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid percentage!");
            return this;
        }

        return this.assignGrade();
    }

    // =========================
    // GRADE ASSIGNMENT
    // =========================
    private GradeCalculator assignGrade() {

        if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        return this.checkPassFail();
    }

    // =========================
    // PASS / FAIL
    // =========================
    private GradeCalculator checkPassFail() {

        isPass = percentage >= 50;

        return this;
    }

    // =========================
    // REPORT GENERATION
    // =========================
    public GradeCalculator generateReport() {

        System.out.println("\n----- REPORT CARD -----");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + (isPass ? "PASS" : "FAIL"));

        return this;
    }
}
