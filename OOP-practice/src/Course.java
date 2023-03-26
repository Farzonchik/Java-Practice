public class Course {
    private String courseName;
    private int numOfStudents = 0;
    private String[] students = new String[20];

    Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numOfStudents] = student;
        numOfStudents++;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        String[] newStudents = new String[numOfStudents - 1];
        for (int i = 0; i <= newStudents.length; i++) {
            if (!(students[i].equals(student))) {
                newStudents[i] = students[i];
            }
        }

        students = newStudents;
        numOfStudents--;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (i < students.length - 1) {
                result.append(students[i]);
                result.append(" ");
            }
        }
        return result.toString();
    }
}