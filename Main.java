import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println("1: Add a student");
        System.out.println("2: See the informatiom/details of a student");
        System.out.println("3: print Lab information");
        System.out.println("4: exit the program");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab lab = new Lab("Foroghi", "saturday", 20);
        int numberOfStudent = 0;
        while (true) {
            Student student = new Student();
            menu();
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter the student name please  ");
                student.setFirstName(scanner.nextLine());
                System.out.print("\nEnter the student lastname  please");
                student.setLastName(scanner.nextLine());
                System.out.print("\nEnter the student ID please ");
                student.setId(scanner.nextInt());
                System.out.println("\nEnter the student field of study please ");
                student.setFieldOfStudy(scanner.nextLine());
                System.out.println("\nEnter the student grade please ");
                student.setGrade(scanner.nextDouble());
                lab.enrollStudent(student, lab.getStudents(), 20);
                numberOfStudent++;
            }
            else if (choice == 2) {
                for (int i = 0; i < numberOfStudent; i++) {
                    student.printStudentInfo(lab.getStudents().get(i));
                }
            }

        }
    }
}