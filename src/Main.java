 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DataBase university = new DataBase("UNIVERSITY OF SINDH", "Institute of Mathematics and Computer Science");

        // Printing the university name and institute name before taking inputs
        System.out.println(university.getCenteredUniversityName());
        System.out.println(university.getCenteredInstituteName() + "\n");
        //Arisha 2k23/CSE/33
        System.out.println("Welcome to our Database project");
        System.out.println("I'm Arisha, I'm say to welcome to all in our project ");

        // Taking input from the user
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Roll Number (e.g., 2k23/CSE/94): ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter Year of Studying (e.g., second year): ");
        String yearOfStudying = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Creating a Student object
        Student student = new Student(studentName, rollNumber, yearOfStudying, course);

        // Printing the details
        System.out.println("\n" + university.getCenteredUniversityName());
        System.out.println(university.getCenteredInstituteName());

        // Displaying the entered student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Year of Studying: " + student.getYearOfStudying());
        System.out.println("Course: " + student.getCourse());

        scanner.close();
    }
}
private static String formatStudentDetails(Student student) {
        return String.format("Name: %s\nRoll Number: %s\nYear of Studying: %s\nCourse: %s",
                student.getName(), student.getRollNumber(), student.getYearOfStudying(), student.getCourse());
    }
}
