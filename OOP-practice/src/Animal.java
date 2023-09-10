class Animal {
    protected String name;
    protected String soundOfAnimal;
    protected int age;

    protected Animal(String name, String soundOfAnimal, int age) {
        this.name = name;
        this.soundOfAnimal = soundOfAnimal;
        this.age = age;
    }

    protected String makeSound() {
        return soundOfAnimal;
    }

    @Override
    public String toString() {
        return String.format("Animal information: \n" +
                "Name: " + name + "\n" +
                "Sound: " + soundOfAnimal + "\n" +
                "Age: " + age);
    }
}
