abstract class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;

        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    protected int getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}