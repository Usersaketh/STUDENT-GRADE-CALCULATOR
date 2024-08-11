import java.util.Scanner;

public class GradeCaluculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            System.err.println();
            int[] marks = new int[numSubjects];
            int totalMarks = 0;

            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextInt();
                totalMarks += marks[i];
            }
            System.out.println("\n--> Total Marks: " + totalMarks);
            double averagePercentage = (double) totalMarks / numSubjects;
            System.out.format("--> Average Percentage: %.2f%%\n", averagePercentage);
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("--> Grade: " + grade + "\n");
        }
    }
}
