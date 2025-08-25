import java.util.Scanner;

public class Stu_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int numSubjects = 5;
        int[] marks = new int[numSubjects];
        int total = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            int input = scanner.nextInt();

            // Validate input
            while (input < 0 || input > 100) {
                System.out.print("Invalid input. Please enter marks between 0 and 100: ");
                input = scanner.nextInt();
            }

            marks[i] = input;
            total += input;
        }

        double average = (double) total / numSubjects;

        
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

    
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total + " out of " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
