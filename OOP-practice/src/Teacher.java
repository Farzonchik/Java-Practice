public class Teacher extends Person {
    private final int levelOfEducation;

    Teacher(String name, int age, int levelOfEducation) {
        super(name, age);
        if (levelOfEducation <= 0) {
            throw new IllegalArgumentException("Level of education cannot be negative!");
        }
        this.levelOfEducation = levelOfEducation;
    }

    public int getLevelOfEducation() {
        return levelOfEducation;
    }

    @Override
    public String toString() {
        return String.format("Teacher{name = %s, age= %d, level of education = %d}", name, age, levelOfEducation);
    }
}