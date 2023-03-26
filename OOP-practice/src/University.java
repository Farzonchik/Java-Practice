import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String name = scanner.nextLine();

        Course course = new Course(name);
        System.out.print("Enter number of new students: ");
        int newNumStudents = scanner.nextInt();

        System.out.println("New student are: ");
        for (int i = 0; i < newNumStudents; i++) {
            String student = scanner.next();
            course.addStudent(student);
        }
        System.out.println("Overall in course new enrolled " + course.getNumOfStudents() + " students");
        System.out.println("Name of new students are: " + course);

        System.out.println();

        System.out.print("Name of dropped student: ");
        String dropped = scanner.next();

        course.dropStudent(dropped);

        System.out.println("After dropping in course " + course.getNumOfStudents() + " students");
        System.out.println("Name of staying students are: " + course);
    }
}