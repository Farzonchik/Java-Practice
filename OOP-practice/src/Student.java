public class Student extends Person {
    private int yearOfStudying;

    Student(String name, int age, int yearOfStudying) {
        super(name, age);
        if (yearOfStudying <= 0) {
            throw new IllegalArgumentException("The Year of studying cannot be negative!");
        }
        this.yearOfStudying = yearOfStudying;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    @Override
    public String toString() {
        return String.format("Student{name = %s, age= %d, year of study = %d}", name, age, yearOfStudying);
    }
}
